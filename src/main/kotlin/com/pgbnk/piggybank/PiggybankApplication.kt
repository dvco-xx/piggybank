package com.pgbnk.piggybank

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class PiggybankApplication {

	@GetMapping("/hi")
	fun sayHi(): String {
		return "Hi"
	}
}

fun main(args: Array<String>) {
	runApplication<PiggybankApplication>(*args)
}
