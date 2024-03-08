package ru.ankwy.server.models

import java.util.concurrent.atomic.AtomicInteger

class Note private constructor(
    val id: Long,
    val title: String,
    val description: String
){
    companion object {
        private val idCounter = AtomicInteger()

        fun newEntry(title: String, description: String) =
            Note(
                id = idCounter.getAndIncrement().toLong(),
                title = title,
                description = description
            )
    }

}
