package com.example.demo.service;

import com.example.demo.enhancer.annotation.EnableLogger;
import com.example.demo.enhancer.annotation.LogBeforeExec;
import org.springframework.stereotype.Service;

@Service
@EnableLogger
public class ServiceA {

    @LogBeforeExec("show方法执行前输出")
    public void show(int dataA, String dataB, boolean dataC){
        System.out.println("ServiceA show方法执行");
    }
}
