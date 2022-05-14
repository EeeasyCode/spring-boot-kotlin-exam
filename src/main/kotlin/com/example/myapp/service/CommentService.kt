package com.example.myapp.service

import com.example.myapp.dto.CommentDto
import com.example.myapp.entity.Comment
import com.example.myapp.repository.BoardRepository
import com.example.myapp.repository.CommentRepository
import com.example.myapp.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.*


@Service
class CommentService (
    private val boardRepository: BoardRepository,
    private val commentRepository: CommentRepository,
    private val userRepository: UserRepository
) {
    fun createComment(boardId: Int, commentDto:CommentDto){
        val nowBoard = boardRepository.getById(boardId)
        val user = nowBoard.user
        commentRepository.save(Comment(commentDto.commentUser, commentDto.commentContent, Date(), nowBoard, user))
    }
}