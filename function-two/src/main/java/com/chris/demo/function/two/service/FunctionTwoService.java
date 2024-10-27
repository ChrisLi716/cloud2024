package com.chris.demo.function.two.service;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
@Data
public class FunctionTwoService {

    @PostConstruct
    private void init(){
        log.info("function two service instance done");
    }

    public void print(String param) {
        log.info("this is function two service print:{}", param);
    }
}
