package com.example.myapp.service


import com.example.myapp.entity.User
import com.example.myapp.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class AuthService (
    private val userRepository: UserRepository
) {
    fun register(userId: String, password: String, userName: String, userSex: String) {
        userRepository.save(User(userId, password, userName, userSex))
    }
}