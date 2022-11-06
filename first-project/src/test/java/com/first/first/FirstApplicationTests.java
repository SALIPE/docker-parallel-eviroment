package com.first.first;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstApplicationTests {

    @Test
    void contextLoads() {

        System.out.println("Roudou a func de testes do primeiro projeto!");
    }

    @Test
    void printsToSee() {

        Integer i;
        for (i = 0; i < 10; i++) {
            System.out.println("\nLinha: ".concat(i.toString()));
        }
    }

}
