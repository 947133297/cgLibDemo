package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceB {

    public void show(int dataA, String dataB, boolean dataC){
        System.out.println("ServiceB show方法执行");
    }
}
