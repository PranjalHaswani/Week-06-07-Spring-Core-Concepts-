package com.example.SpringCoreConcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    //Correct SLF4J Logger
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    private final EmployeeBean employee;


    public HelloController(EmployeeBean employee) {
        this.employee = employee;
    }
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
    //Fetch Employee Details
    @GetMapping("/details")
    public String getEmployeeDetailsUC3(){
        return employee.getEmployeeDetails();
    }
}
