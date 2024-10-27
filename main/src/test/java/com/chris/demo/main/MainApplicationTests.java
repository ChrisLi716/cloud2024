package com.chris.demo.main;

import com.chris.demo.main.service.MainService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MainApplicationTests {
    @Resource
    private MainService mainService;

    @Test
    void print() {
        mainService.print("hello, I'm importing something");
    }

    @Test
    void print2() {
        mainService.print("hello, import function one by add @EnableFunctionOne");
    }

    @Test
    void print3() {
        mainService.print("hello, import function one by implementing ImportSelector");
    }

    @Test
    void print4() {
        mainService.print("hello, import function one by implementing ImportBeanRegistrar");
    }


}
