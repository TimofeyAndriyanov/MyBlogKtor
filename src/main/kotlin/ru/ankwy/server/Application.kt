package ru.ankwy.server

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ru.ankwy.server.plugins.configureMain

fun main() {
    embeddedServer(
        factory = Netty,
        port = 8080,
        host = "0.0.0.0",
        module = Application::module
    ).apply {
        start(wait = true)
    }
}

fun Application.module() {
    configureMain()
}
