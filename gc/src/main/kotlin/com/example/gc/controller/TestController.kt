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

    @GetMapping("/createObjects")
    fun createManyObjects(): String{
        for (i in 1..100_000_000_000) {
            var obj = Data()
        }

        return "객체 대량 생성 완료"
    }

    @GetMapping("/createObjects2")
    fun createManyObjects2(): String{
        for (i in 1..100_000_000_000) {
            var obj = OtherData()
        }

        return "객체 대량 생성 완료2"
    }
}

class Data

class OtherData