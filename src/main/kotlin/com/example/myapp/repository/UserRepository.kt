package com.example.myapp.repository

import com.example.myapp.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, String>