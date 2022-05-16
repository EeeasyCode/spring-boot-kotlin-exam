package com.example.myapp.dto

import java.util.Date

data class CommentDto(
    val commentUser: String,
    val commentContent: String,
    val createdAt: Date?,
)
