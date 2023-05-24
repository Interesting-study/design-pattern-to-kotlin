package com.gof.pattern.factorymethod.javatokotlin.after

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Config {
    @Bean
    fun hello(): String {
        return "hello"
    }
}
