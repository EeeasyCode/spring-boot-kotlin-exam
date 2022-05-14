package com.example.myapp.contorller

import com.example.myapp.dto.*
import com.example.myapp.entity.Comment
import com.example.myapp.entity.User
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
    fun createBoard(@RequestBody request:BoardDto) {
        request.apply{
            return boardService.createBoard(
                BoardDto(userId, boardTitle, boardMain, Date(), Date())
            )
        }
    }

    @GetMapping("/read/{boardId}")
    fun readBoard(@PathVariable boardId: Int): ReadDto {
        return boardService.readBoard(boardId)

    }

    @DeleteMapping("/delete/{boardId}")
    fun delBoard(@PathVariable boardId: Int) {
        return boardService.delBoard(boardId)
    }

    @PutMapping("/update/{boardId}")
    fun updateBoard(@PathVariable boardId: Int, @RequestBody request: UpdateBoardDto):UpdateBoardDto {
        return boardService.updateBoard(boardId, request)
    }
    //게시글 COMMENT API
    @PostMapping("/comment/{boardId}")
    fun createComment(@PathVariable boardId: Int, @RequestBody request: CommentDto){
        return commentService.createComment(boardId, request)
    }

    @GetMapping("/comment/{boardId}")
    fun getComment(@PathVariable boardId: Int): List<GetCommentDto> {
        return commentService.getComment(boardId)
    }
}
