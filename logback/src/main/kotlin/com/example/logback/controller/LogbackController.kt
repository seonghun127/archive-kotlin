package com.example.logback.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LogbackController {

    private val log: Logger by lazy { LoggerFactory.getLogger(LogbackController::class.java) }

    @GetMapping("/trace")
    fun trace(): String {
        log.trace("[TRACE] test for trace log")
        return "ok"
    }

    @GetMapping("/debug")
    fun debug(): String {
        log.debug("[DEBUG] test for debug log")
        return "ok"
    }

    @GetMapping("/info")
    fun info(): String {
        log.info("[INFO] test for info log")
        return "ok"
    }

    @GetMapping("/warn")
    fun warn(): String {
        log.warn("[WARN] test for warn log")
        return "ok"
    }

    @GetMapping("/error")
    fun error(): String {
        log.error("[ERROR] test for error log")
        return "ok"
    }
}