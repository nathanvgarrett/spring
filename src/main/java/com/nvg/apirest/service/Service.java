package com.nvg.apirest.service;

@org.springframework.stereotype.Service
public class Service {

    public String sayHello(String name) {
        return "Hello World! How are you " + name + "?";
    }

}