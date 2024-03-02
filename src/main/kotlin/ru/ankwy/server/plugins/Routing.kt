package ru.ankwy.server.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import ru.ankwy.server.core.Constants
import java.io.File

fun Application.configureMain() {
    routing {
        get("/") {
            call.respondFile(
                file = File(Constants.MAIN_DIR)
            )
        }
    }
}
