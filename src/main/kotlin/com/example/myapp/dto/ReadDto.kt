package com.example.myapp.dto

import java.util.Date

data class ReadDto(
    val boardId: Int,
    val boardTitle: String,
    val boardMain: String,
    val createdAt: Date?,
    val updatedAt: Date?
)
