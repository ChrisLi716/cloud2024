package com.chris.demo.main.service;

import com.chris.demo.function.one.service.FunctionOneService;
import com.chris.demo.function.two.service.FunctionTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MainService {
    @Resource
    private FunctionOneService functionOneService;

    @Autowired(required = false)
    private FunctionTwoService functionTwoService;

    public void print(String param) {
        functionOneService.print(param);
        functionTwoService.print(param);
    }

}
