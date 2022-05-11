package com.example.myapp.entity

import javax.persistence.*


@Entity
@Table(name = "users")
class User (
    val userName: String,
    val userAge: Int,
    val userSex: String,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var userId: Int = 0
}