package com.example.myapp.contorller

import com.example.myapp.entity.User
import com.example.myapp.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    //repository를 controller에서 직접 주입
    //아직 service 로직을 구현하지 않았기 때문에, controller에서 구현
    private val userRepository: UserRepository
    ) {
    @GetMapping("/users")
    fun listUsers(): List<User> {
        return userRepository.findAll()
    }
}