package com.example.gc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(
    exclude = [HibernateJpaAutoConfiguration::class]
)
class GcApplication

fun main(args: Array<String>) {
    runApplication<GcApplication>(*args)
}
