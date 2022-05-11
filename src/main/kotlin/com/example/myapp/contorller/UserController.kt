package com.example.myapp.contorller

import com.example.myapp.dto.UserDto
import com.example.myapp.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(
    private val userService: UserService
) {
 @GetMapping("/{id}")
 fun getUser(@PathVariable id: Int): UserDto {
     return userService.getUser(id)
 }
}