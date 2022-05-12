package com.example.myapp.service

import com.example.myapp.dto.UserDto
import com.example.myapp.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {
    fun getUser(userId: String): UserDto {
        userRepository.getById(userId).apply {
            return UserDto(userId, password, userName, userSex)
        }
    }
    fun delUser(userId: String) {
        userRepository.deleteById(userId)
    }
}