package com.example.myapp.entity

import javax.persistence.*


@Entity
@Table(name = "users")
class User (
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val name: String,
    val age: String,
    val sex: String,
)