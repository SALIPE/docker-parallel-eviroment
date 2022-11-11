package com.second.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello WRLD";
    }

    @RequestMapping("/first")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public void teste() {
        System.out.println("Primiro projeto online");
    }

    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class, args);
    }

}
