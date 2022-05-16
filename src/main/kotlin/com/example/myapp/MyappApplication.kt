package com.example.myapp

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

val logger: Logger = LoggerFactory.getLogger("MyappLogger")

@SpringBootApplication
class MyappApplication

fun main(args: Array<String>) {
    runApplication<MyappApplication>(*args)
}
