package org.orca.badlang

import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType

fun main(args: Array<String>) {
    val argParser = ArgParser("badlang")

    val interactiveMode by argParser.option(
        type = ArgType.Boolean,
        shortName = "i",
        fullName = "interactive",
        description = "Run in interactive mode"
    )

    argParser.parse(args)

    if (interactiveMode == true) {

    }
}