package com.gof.pattern.singleton

import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Configuration

@Configuration
class CheckSingletonInSpring

fun main(args: Array<String>) {
    val context: ApplicationContext = AnnotationConfigApplicationContext(CheckSingletonInSpring::class.java)
}
