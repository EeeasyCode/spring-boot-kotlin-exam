package com.example.myapp.dto

import java.util.Date

data class GetCommentDto(
    val commentUser: String,
    val commentContent: String,
    val commentId: Int,
    val createdAt: Date?,
)
