package ru.ankwy.server.routes

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import ru.ankwy.server.core.Arrays

fun Application.configureApi() =
    routing {
        configureNotes()
    }

private fun Route.configureNotes() =
    route("/notes") {
        get {
            if (Arrays.notesStorage.isNotEmpty()) {
                call.respond(Arrays.notesStorage)
            } else {
                call.respondText("Данных нету!")
            }
        }
    }
