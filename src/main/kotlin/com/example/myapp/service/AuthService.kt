package com.example.myapp.service

import com.example.myapp.dto.RegisterDto
import com.example.myapp.entity.User
import com.example.myapp.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class AuthService(
    private val userRepository: UserRepository
) {
    fun register(userId: String, password: String, userName: String, userSex: String): String {
        userRepository.save(User(userId, password, userName, userSex))
        return userId
    }

//    fun login(userId: String, password: String){
//        val db_user = userRepository.findById(userId)
//        if (db_user != null) {
//
//        }
//    }
}
