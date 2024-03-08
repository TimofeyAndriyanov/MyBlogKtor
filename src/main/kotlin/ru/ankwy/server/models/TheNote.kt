package ru.ankwy.server.models

import kotlinx.serialization.Serializable

@Serializable
data class TheNote(
    val id: Long,
    val title: String,
    val description: String
)
