package com.example.myapp.service

import com.example.myapp.dto.CommentDto
import com.example.myapp.dto.GetCommentDto
import com.example.myapp.dto.UpdateCommentDto
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

    //원하는 정보만 return 어떻게 사용하는지 -> DTO 를 사용해서 return값 반환
    fun getComment(boardId: Int):List<GetCommentDto> {
        val post = boardRepository.findById(boardId).get()
        return commentRepository.findCommentsByBoard(post)
    }

    fun deleteComment(commentId: Int){
        commentRepository.deleteById(commentId)
    }

    fun updateComment(commentId: Int, request: UpdateCommentDto):UpdateCommentDto{
        val nowComment = commentRepository.getById(commentId)

        nowComment.commentContent = request.commentContent
        commentRepository.save(nowComment)
        return UpdateCommentDto(nowComment.commentContent)
    }
}

