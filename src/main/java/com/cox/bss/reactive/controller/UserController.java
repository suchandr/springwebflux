package com.cox.bss.reactive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
public class UserController {
    @GetMapping("/user")
    public Mono<String> getUserWithDelay(@RequestParam long delay) {
        return Mono.just("SPRING-MVC-USER").delayElement(Duration.ofMillis(delay));
    }
}
