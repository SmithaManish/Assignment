package com.example.Assignment

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AssignmentApplication

fun main(args: Array<String>) {

	runApplication<AssignmentApplication>(*args)
	println(" **** Spring Boot Kotlin RESTful Web Services CRUD Example!!! *****")
}
