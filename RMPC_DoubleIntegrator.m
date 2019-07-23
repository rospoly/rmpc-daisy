function double_int_fast(inputM, discard)
%% 
    
    addpath(genpath('/home/roccosalvia/Documents/MATLAB/YALMIP-master'))
    addpath(genpath('/home/roccosalvia/Documents/MATLAB/MATLAB_files'))
    addpath(genpath('/home/roccosalvia/Documents/MATLAB/MPT/tbxmanager'))
    m = inputM;%Change this to change number of partitions!!!
    %fake inputs
    delta=.1;
    epss=.001;
    % This example shows how to control a double integrator plant under input
    % saturation in Simulink(R) using explicit MPC.
    %
    % See also MPCDOUBLEINT.

    % Copyright 1990-2014 The MathWorks, Inc.
    tic
    %% Define Plant Model
    % The linear open-loop dynamic model is a double integrator:
    plant = tf(1,[1 0 0]);

    %% Design MPC Controller
    % Create the controller object with sampling period, prediction and control
    % horizons:
    Ts = 0.1;   
    p = 30;
    mpcobj = mpc(plant, Ts, p, m);
    %%
    % Specify actuator saturation limits as MV constraints.
    mpcobj.MV = struct('Min',-1,'Max',1); 

    %% Generate Explicit MPC Controller
    % Explicit MPC executes the equivalent explicit piecewise affine version of
    % the MPC control law defined by the traditional MPC.  To generate an
    % Explicit MPC from a traditional MPC, you must specify range for each
    % controller state, reference signal, manipulated variable and measured
    % disturbance so that the multi-parametric quadratic programming problem is
    % solved in the parameter space defined by these ranges.

    %% 
    % *Obtain a range structure for initialization*
    %%
    % Use |generateExplicitRange| command to obtain a range structure where you
    % can specify range for each parameter afterwards.
    range = generateExplicitRange(mpcobj);

    %% 
    % *Specify ranges for controller states*
    %%
    % MPC controller states include states from plant model, disturbance model
    % and noise model in that order.  Setting the range of a state variable is
    % sometimes difficult when the state does not correspond to a physical
    % parameter.  In that case, multiple runs of open-loop plant simulation
    % with typical reference and disturbance signals are recommended in order
    % to collect data that reflect the ranges of states.
    range.State.Min(:) = [-10;-10];
    range.State.Max(:) = [10;10];

    %% 
    % *Specify ranges for reference signals*
    %%
    % Usually you know the practical range of the reference signals being used
    % at the nominal operating point in the plant.  The ranges used to generate
    % Explicit MPC must be at least as large as the practical range.
    range.Reference.Min = -2;
    range.Reference.Max = 2;

    %% 
    % *Specify ranges for manipulated variables*
    %%
    % If manipulated variables are constrained, the ranges used to generate
    % Explicit MPC must be at least as large as these limits.
    range.ManipulatedVariable.Min = -1.1;
    range.ManipulatedVariable.Max = 1.1;

    %% 
    % *Construct the Explicit MPC controller*
    %%
    % Use |generateExplicitMPC| command to obtain the Explicit MPC controller 
    % with the parameter ranges previously specified.
    mpcobjExplicit = generateExplicitMPC(mpcobj, range);
    display(mpcobjExplicit);
    %%
    % Use |simplify| command with the "exact" method to join pairs of regions
    % whose corresponding gains are the same and whose union is a convex set.
    % This practice can reduce memory footprint of the Explicit MPC controller
    % without sacrifice any performance.
    %mpcobjExplicit = simplify(mpcobjExplicit1, 'exact');
    %mpcobjExplicit =simplify(mpcobjExplicit1,'exact',.1);
    %mpcobjExplicit =simplify(mpcobjExplicit,'radius',1)
    display(mpcobjExplicit);
    %% converting outputs to our desired format
    [A,B,C,D]=tf2ss(cell2mat(mpcobj.Model.Plant.Numerator),cell2mat(mpcobj.Model.Plant.Denominator));
    num_col=size(mpcobjExplicit.PiecewiseAffineSolution(1).H,2);
    MPC_all=mpcobjExplicit.PiecewiseAffineSolution;
    F1=reshape(extractfield(MPC_all,'F'),[num_col,size(MPC_all,2)])';
    F=F1(:,1:size(cell2mat(mpcobj.Model.Plant.Denominator),2)-1);
    G1=reshape(extractfield(MPC_all,'G'),[size(MPC_all,2),1]);
    G=G1;
    H_ind=1;
    for i=1:1:size(MPC_all,2)
        H(H_ind:H_ind-1+size(mpcobjExplicit.PiecewiseAffineSolution(i).H,1),1:2)=mpcobjExplicit.PiecewiseAffineSolution(i).H(:,1:2);
        K(H_ind:H_ind-1+size(mpcobjExplicit.PiecewiseAffineSolution(i).K,1),1)=mpcobjExplicit.PiecewiseAffineSolution(i).K(:,1);
        H_ind=H_ind+size(mpcobjExplicit.PiecewiseAffineSolution(i).H,1);
    end
    %H2=extractfield(MPC_all,'H')';
    %H1=reshape(H2,[size(H2,1)/num_col,num_col]);
    %H=H1(:,1:size(cell2mat(mpcobj.Model.Plant.Denominator),2)-1);
    %K1=reshape(extractfield(MPC_all,'K'),[size(H1,1),1]);
    %K=K1;
    for cont_num=1:1:size(MPC_all,2)
        Nc(cont_num,1)=size(mpcobjExplicit.PiecewiseAffineSolution(cont_num).H,1);
    end
    %%
    %%
    close all
    xxx=sdpvar(size(A,1),1);
    nn=0;
    mm=0;
    Nc_acc=cumsum(Nc);
    N_nei=1;
    %reshape H, K for demonstration purposes!
    H_line=zeros(size(Nc,1),max(Nc)*size(A,1));
    H_line=zeros(size(Nc,1),max(Nc));
    e_corner=0;
    e_border=0;
    for i=1:1:size(Nc,1)
        if i~=1
            H_line(i,1:Nc(i)*size(A,1))=reshape(H(Nc_acc(i-1)+1:Nc_acc(i),:)',[1,Nc(i)*size(A,1)]);
            K_line(i,1:Nc(i))=reshape(K(Nc_acc(i-1)+1:Nc_acc(i),:)',[1,Nc(i)*1]);
        else
            H_line(i,1:Nc(i)*size(A,1))=reshape(H(1:Nc_acc(i),:)',[1,Nc(i)*size(A,1)]);
            K_line(i,1:Nc(i))=reshape(K(1:Nc_acc(i),:)',[1,Nc(i)*1]);
        end

    end
    
    for i=1:1:size(Nc,1)%Loop over all the regions
        i
        ii1=H(nn+1:nn+Nc(i),:);%H partition for region 'i'
        jj1=K(nn+1:nn+Nc(i),:);%K partition for region 'i'
        V=[];
        V=lcon2vert(ii1,jj1,[],[]);%set of all vertices of region 'i'
        
        %%First compute the maximum error around vertices
        %construct a binary matrix of 0s and 1s
        binary_mat=zeros(2^size(A,1),size(A,1));
        for binary_ind=0:1:2^size(A,1)-1
            binary_ind_rem=binary_ind;
            for sub=size(A,1)-1:-1:0
                if binary_ind_rem>2^sub-1
                    binary_mat(binary_ind+1,sub+1)=1;
                    binary_ind_rem=binary_ind_rem-2^sub;
                else
                    binary_mat(binary_ind+1,sub+1)=0;
                end
            end
        end
        corner_set=[];
        for v_ind=1:1:size(V,1) 
            for corner_ind=1:1:size(binary_mat,1)
                for eps_dim=1:1:size(A,1)
                    if binary_mat(corner_ind,eps_dim)==1
                        corner_set(corner_ind,eps_dim)=V(v_ind,eps_dim)+epss;
                    else
                        corner_set(corner_ind,eps_dim)=V(v_ind,eps_dim)-epss;
                    end
                end
            end
            %find out which regions are neigbours with the vertex v_ind^{th}
            for rest_reg_ind=1:1:size(Nc,1)
                repeat_ind=0;
                if rest_reg_ind~=i
                    H_set_rest_reg_ind=[];
                    K_set_rest_reg_ind=[];
                    if rest_reg_ind==1
                        H_set_rest_reg_ind=H(1:Nc_acc(1),:);
                        K_set_rest_reg_ind=K(1:Nc_acc(1),1);
                    else
                        H_set_rest_reg_ind=H(Nc_acc(rest_reg_ind-1)+1:Nc_acc(rest_reg_ind),:);
                        K_set_rest_reg_ind=K(Nc_acc(rest_reg_ind-1)+1:Nc_acc(rest_reg_ind),1);
                    end
                    %V_rest_reg_ind=lcon2vert(H_set_rest_reg_ind,K_set_rest_reg_ind,[],[],1e-15);
                    %for v_rest_reg_ind=1:1:size(V_rest_reg_ind,1) 
                    for v_rest_reg_ind=1:1:size(H_set_rest_reg_ind,1)
                        %if norm(V_rest_reg_ind(v_rest_reg_ind,:)-V(v_ind,:))<1e-5
                        if norm(H_set_rest_reg_ind(v_rest_reg_ind,:)*V(v_ind,:)'-K_set_rest_reg_ind(v_rest_reg_ind,1))<1e-5
                            repeat_ind=repeat_ind+1;
                            for corner_ind=1:1:size(corner_set,1)
                                e_corner_ij=abs((F(i,:)-F(rest_reg_ind,:))*corner_set(corner_ind,:)'+G(i)-G(rest_reg_ind));
                                if repeat_ind>1
                                    ggg=1;
                                end
                                if e_corner_ij>e_corner && repeat_ind>1
                                    e_corner=e_corner_ij;
                                end
                            end
                        end
                    end
                            
                end
                %clear H_set_rest_reg_ind K_set_rest_reg_ind V_rest_reg_ind
                H_set_rest_reg_ind=[];
                K_set_rest_reg_ind=[];
                V_rest_reg_ind=[];
            end
        end
        nn=nn+Nc(i);          
    end
    

    %% Compute region ranges (X) and so on based on maximum feasible range
    nn=0;
    for i=1:1:size(Nc,1)%Loop over all the regions
        ii1=H(nn+1:nn+Nc(i),:);%H partition for region 'i'
        jj1=K(nn+1:nn+Nc(i),:);%K partition for region 'i'
        V=[];
        %V=lcon2vert(ii1,jj1,[],[],1e-80);%set of all vertices of region 'i'

                
        rangee=[10,10]
        num_neigh(i)=0;%
        ver_ind=1;
        for j=1:1:Nc(i)%go over the all borders around region 'i'
            for ii=1:1:size(A,1)%Compute the range for j^{th} borders for i^{th} region
                minn1(1,ii)=-rangee(ii);
                maxx1(1,ii)=rangee(ii);
            end
            %To update range for i^{th} region
            if j==1
                minn_reg=minn1;
                maxx_reg=maxx1;
            else
                for qq=1:1:size(A,1)
                    if minn_reg(qq)>minn1(1,qq)
                        minn_reg(qq)=minn1(1,qq);
                    end
                    if maxx_reg(qq)<maxx1(1,qq)
                        maxx_reg(qq)=maxx1(1,qq);
                    end
                end
            end
        end
        %putting together region range updates 
        for dim=1:1:size(A,1)
            if dim==1  
                X(i,1:2)=[minn_reg(dim),maxx_reg(dim)];
                pointer_reg=3;
            else
                X(i,pointer_reg:pointer_reg+1)=[minn_reg(dim),maxx_reg(dim)];
                pointer_reg=pointer_reg+2;
            end
        end
        nn=nn+Nc(i);            
    end  



%% Compute Line Range
    close all
    nn=0;
    line_ind_glob=1;
    for region=1:1:size(Nc,1)
        ii2=H(nn+1:nn+Nc(region),:);%H partition for region 'region'
        jj2=K(nn+1:nn+Nc(region),:);%K partition for region 'region'
        for line_ind=1:1:Nc(region)
            for dim=1:1:size(A)
                if dim==1
                    LINE_RANGE(line_ind_glob,1:size(A,1)+1+dim*2)=[ii2(line_ind,:),jj2(line_ind,:),X(region,dim*2-1:dim*2)];
                else
                    LINE_RANGE(line_ind_glob,size(A,1)+1+dim*2-1:size(A,1)+1+dim*2)=[X(region,dim*2-1:dim*2)];
                end
            end
            line_ind_glob=line_ind_glob+1;
        end
        nn=nn+Nc(region);            
    end 
    %% Plot Piecewise Affine Partition
    % You can review any 2-D section of the piecewise affine partition defined
    % by the Explicit MPC control law.

    %% 
    % *Obtain a plot parameter structure for initialization*
    %%
    % Use |generatePlotParameters| command to obtain a parameter structure
    % where you can specify which 2-D section to plot afterwards.
    params = generatePlotParameters(mpcobjExplicit);

    %% 
    % *Specify parameters for a 2-D plot*
    %%
    % In this example, you plot the 1th state variable vs. the 2nd state
    % variable.  All the other parameters must be fixed at a value within its
    % range.
    params.State.Index = []; 
    params.State.Value = [];
    %%
    % Fix other reference signals
    params.Reference.Index = 1;
    params.Reference.Value = 0;
    %%
    % Fix manipulated variables
    params.ManipulatedVariable.Index = 1;
    params.ManipulatedVariable.Value = 0;
    %% 
    % *Plot the 2-D section*
    %%
    % Use |plotSection| command to plot the 2-D section defined previously.
    plotSection(mpcobjExplicit, params);
    axis([-4 4 -4 4]);
    grid
    xlabel('State #1');
    ylabel('State #2');
    %%
    %Print outputs
    clc
    printMatrix(F,'F')
    printMatrix(G,'G')
    printMatrix(H_line,'H')
    printMatrix(K_line,'K') 
    printMatrix(X,'X')
    %printMatrix(neigh_mat,'neigh_mat')
    printMatrix(e_corner,'error_ij')
    printMatrix(Nc_acc-ones(size(Nc,1),1),'region_pointer')
    printMatrix(LINE_RANGE,'LINE_RANGE')
    clear all
    time=toc

end


%%
%function for printing 
function printMatrix(matrix, name)
    fprintf('%s = \n\n\n',name)
    for row=1:size(matrix,1)
        fprintf(' %s \n',sprintf(' %.15f ', matrix(row,:)))
    end
    fprintf('\n')
end   

%%


