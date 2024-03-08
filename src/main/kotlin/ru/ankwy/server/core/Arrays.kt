package ru.ankwy.server.core

import ru.ankwy.server.models.Note
import ru.ankwy.server.models.TheNote

object Arrays {
    val notesStorage = mutableListOf(
        TheNote(
            id = 1,
            title = "заголовок 1",
            description = "описание 1"
        ),
        TheNote(
            id = 2,
            title = "заголовок 2",
            description = "описание 2"
        ),
        TheNote(
            id = 3,
            title = "заголовок 3",
            description = "описание 3"
        ),
        TheNote(
            id = 4,
            title = "заголовок 4",
            description = "описание 4"
        ),
        TheNote(
            id = 5,
            title = "заголовок 5",
            description = "описание 5"
        ),
        TheNote(
            id = 6,
            title = "заголовок 6",
            description = "описание 6"
        ),
        TheNote(
            id = 7,
            title = "заголовок 7",
            description = "описание 7"
        ),
        TheNote(
            id = 8,
            title = "заголовок 8",
            description = "описание 8"
        ),
        TheNote(
            id = 9,
            title = "заголовок 9",
            description = "описание 9"
        ),
        TheNote(
            id = 10,
            title = "заголовок 10",
            description = "описание 10"
        )
    )

    val notes = mutableListOf(
        Note.newEntry(
            title = "заголовок 1",
            description = "описание 1"
        )
    )
}