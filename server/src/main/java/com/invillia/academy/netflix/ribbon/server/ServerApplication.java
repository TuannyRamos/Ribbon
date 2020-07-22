package com.invillia.academy.netflix.ribbon.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ServerApplication {

    private static Logger logger = LoggerFactory.getLogger(ServerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

    @GetMapping("/hello")
    public String helloWorld() {
        logger.info("acessando hello world");
        return "hello world";
    }

    @GetMapping("/")
    public String home() {
        logger.info("acessando home");
        return "home";
    }
}
