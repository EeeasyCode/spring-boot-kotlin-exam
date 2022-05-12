package com.example.myapp.entity

import javax.persistence.*


@Entity
@Table(name = "users")
class User(
    val userName: String,
    val userAge: String,
    val userId: String,
    val userSex: String,

) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var crateId: Int = 0
}