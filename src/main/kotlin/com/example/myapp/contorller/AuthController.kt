package com.example.myapp.contorller

import com.example.myapp.dto.LoginDto
import com.example.myapp.dto.RegisterDto
import com.example.myapp.service.AuthService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
class AuthController(
    private val authService: AuthService,
) {
    @PostMapping("/register")
    fun register(@RequestBody request: RegisterDto) {
        request.apply {
            return authService.register(userId, password, userName, userSex)
        }
    }

//    @PostMapping("/login")
//    fun login(@RequestBody request: LoginDto) {
//        request.apply {
//            return authService.login(userId, password)
//        }
//    }
}