package com.example.myapp.entity

import javax.persistence.*


@Entity
@Table(name = "users")
class User(
    @Id
    val userId: String,

    val password: String,
    val userName: String,
    val userSex: String,
    )


