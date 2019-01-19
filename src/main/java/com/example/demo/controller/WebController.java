package com.example.demo.controller;

import com.example.demo.service.ServiceA;
import com.example.demo.service.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Autowired
    ServiceA serviceA;

    @Autowired
    ServiceB serviceB;

    @GetMapping("/a")
    public void a(){
        serviceA.show(1,"2",false);
        serviceB.show(3,"4",true);
    }
}
