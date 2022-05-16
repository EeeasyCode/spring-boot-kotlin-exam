package com.example.myapp.contorller

import com.example.myapp.dto.*
import com.example.myapp.service.BoardService
import com.example.myapp.service.CommentService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("board")
class BoardController(
    private val boardService: BoardService,
    private val commentService: CommentService
) {
    //게시판 CRUD API
    @PostMapping("/create")
    fun createBoard(@RequestBody request: BoardDto) {
        request.apply {
            return boardService.createBoard(
                BoardDto(userId, boardTitle, boardMain, Date(), Date())
            )
        }
    }

    @GetMapping("/{boardId}/read")
    fun readBoard(@PathVariable boardId: Int): ReadDto {
        return boardService.readBoard(boardId)
    }

    @DeleteMapping("/{boardId}/delete")
    fun deleteBoard(@PathVariable boardId: Int) {
        return boardService.deleteBoard(boardId)
    }

    @PutMapping("/{boardId}/update")
    fun updateBoard(@PathVariable boardId: Int, @RequestBody request: UpdateBoardDto): UpdateBoardDto {
        return boardService.updateBoard(boardId, request)
    }
    //게시글 COMMENT API
    @PostMapping("/comment/{boardId}/create")
    fun createComment(@PathVariable boardId: Int, @RequestBody request: CommentDto) {
        return commentService.createComment(boardId, request)
    }

    @GetMapping("/comment/{boardId}/getInfo")
    fun getComment(@PathVariable boardId: Int): List<GetCommentDto> {
        return commentService.getComment(boardId)
    }
    @DeleteMapping("/comment/{commentId}/delete")
    fun deleteComment(@PathVariable commentId: Int) {
        return commentService.deleteComment(commentId)
    }

    @PutMapping("/comment/{commentId}/update")
    fun updateComment(@PathVariable commentId: Int, @RequestBody request: UpdateCommentDto): UpdateCommentDto {
        return commentService.updateComment(commentId, request)
    }
}
