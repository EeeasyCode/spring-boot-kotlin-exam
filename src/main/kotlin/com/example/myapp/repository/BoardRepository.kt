package com.example.myapp.repository

import com.example.myapp.entity.Board
import com.example.myapp.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository:JpaRepository<Board, Int>