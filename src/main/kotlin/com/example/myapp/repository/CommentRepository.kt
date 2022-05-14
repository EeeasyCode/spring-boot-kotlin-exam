package com.example.myapp.repository

import com.example.myapp.entity.Comment
import org.springframework.data.jpa.repository.JpaRepository

interface CommentRepository:JpaRepository<Comment, Int>