package com.tom.jenk.tomcatpipelinedemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TomcatPipelineDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void runTestOne() {
        System.out.println("The Application is running");
    }

    @Test
    void runTestTwo() {
        System.out.println("The Application is ok");
    }
}
