package com.example.gc.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/fullgc")
    fun generateFullGC(): String {
        System.gc()

        return "Full GC 완료"
    }

    @GetMapping("/create-objects")
    fun createManyObjects(): String{
        for (i in 1..100_000_000_000) {
            var obj = Data()
        }

        return "객체 대량 생성 완료"
    }
}

class Data
