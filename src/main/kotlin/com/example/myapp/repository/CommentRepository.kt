package com.example.myapp.repository

import com.example.myapp.dto.GetCommentDto
import com.example.myapp.entity.Board
import com.example.myapp.entity.Comment
import org.springframework.data.jpa.repository.JpaRepository

interface CommentRepository : JpaRepository<Comment, Int> {
    fun findCommentsByBoard(post: Board): List<GetCommentDto>
}
