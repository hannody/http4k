package org.http4k.serverless

import dev.forkhandles.bunting.use
import org.http4k.cloudnative.env.Environment

fun main(args: Array<String>) =
    OpenWhiskCliFlags(args).use {
        Environment.openWhiskClient().invokeActionInPackage(namespace, packageName, actionName, emptyMap(), "true", "true")
    }