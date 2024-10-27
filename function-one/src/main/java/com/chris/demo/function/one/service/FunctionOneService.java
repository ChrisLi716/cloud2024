package com.chris.demo.function.one.service;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Data
@Slf4j
public class FunctionOneService {

    @PostConstruct
    private void init() {
        log.info("function one service instance done");
    }

    public void print(String param) {
        log.info("this is function one service print:{}", param);
    }
}
