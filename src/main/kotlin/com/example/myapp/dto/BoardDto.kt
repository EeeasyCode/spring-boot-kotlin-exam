package com.example.myapp.dto

import com.example.myapp.entity.Board
import java.util.Date

data class BoardDto(
    val userId: String,
    val boardTitle: String,
    val boardMain: String,
    val createdAt: Date?,
    var updatedAt: Date?
)