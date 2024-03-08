package ru.ankwy.server

import ru.ankwy.server.routes.configureApi
import ru.ankwy.server.core.Constants
import io.ktor.server.application.*
import ru.ankwy.server.plugins.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(
        factory = Netty,
        port = Constants.PORT,
        host = Constants.HOST,
        module = Application::modules
    ).apply {
        start(wait = true)
    }
}

fun Application.modules() {
    configureMain()
    configureSerialization()
    configureApi()
    configureStatic()
    configureTemplating()
    configureInfo()
    configureContacts()
}
