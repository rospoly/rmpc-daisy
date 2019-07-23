package unit

import daisy.Main

class CommandLineOptionsTest extends UnitSuite {
  test("Verify Command Line Options") {
    val allOpts =
    Main.globalOptions.toList.map((_, "global")) ++
    Main.allPhases.flatMap(c => c.definedOptions.toList.map((_, c.name)))
    allOpts.groupBy(_._1.name).collect{
      case (name, opts) =>
        assert(opts.size === 1)
    }
  }
}