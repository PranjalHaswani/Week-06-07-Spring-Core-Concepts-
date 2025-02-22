package com.example.SpringCoreConcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    //Correct SLF4J Logger
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, Spring Boot!";
    }

    //UC2: Hello World with Logging
    @GetMapping("/uc2")
    public String sayHelloUC2() {
        logger.info("GET request received at /hello/uc2");
        return "Hello from BridgeLabz with Logging";
    }

}
