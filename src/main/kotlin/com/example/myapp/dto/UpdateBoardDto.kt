package com.example.myapp.dto

import java.util.Date

data class UpdateBoardDto(
    val boardTitle: String,
    val boardMain: String,
    val updatedAt: Date?
)
