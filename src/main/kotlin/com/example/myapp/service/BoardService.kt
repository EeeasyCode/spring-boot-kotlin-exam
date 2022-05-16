package com.example.myapp.service

import com.example.myapp.dto.BoardDto
import com.example.myapp.dto.ReadDto
import com.example.myapp.dto.UpdateBoardDto
import com.example.myapp.entity.Board
import com.example.myapp.repository.BoardRepository
import com.example.myapp.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.Date

@Service
class BoardService(
    private val boardRepository: BoardRepository,
    private val userRepository: UserRepository
) {
    fun createBoard(boardDto: BoardDto) {
        val user = userRepository.getById(boardDto.userId)
        boardDto.apply {
            boardRepository.save(Board(boardTitle, boardMain, createdAt, updatedAt, user))
        }
    }

    fun readBoard(boardId: Int): ReadDto {
        boardRepository.getById(boardId).apply {
            return ReadDto(boardId, boardTitle, boardMain, createdAt, updatedAt)
        }
    }

    fun deleteBoard(boardId: Int) {
        boardRepository.deleteById(boardId)
    }

    fun updateBoard(boardId: Int, request: UpdateBoardDto): UpdateBoardDto {
        val nowBoard = boardRepository.getById(boardId)

        nowBoard.boardTitle = request.boardTitle
        nowBoard.boardMain = request.boardMain
        nowBoard.updatedAt = Date()
        boardRepository.save(nowBoard)
        return UpdateBoardDto(nowBoard.boardTitle, nowBoard.boardMain, nowBoard.updatedAt)
    }
}
