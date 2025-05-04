package com.nvg.apirest.controller;

import com.nvg.apirest.domain.User;
import com.nvg.apirest.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest-api")
public class Controller {

    @Autowired
    private Service service;

    @GetMapping("/get")
    public String Hello() {
        return service.sayHello("Nathan");
    }

    /*
    @PostMapping("/post")
    public String PostHelloWorld(@RequestBody User body) {
        return "Username: " + body.getUsername() + "\nPassword: " + body.getPassword();
    }

    @PostMapping("/{id}")
    public String PostPathUser(@PathVariable("id") String id, @RequestBody User body) {
        return "Username: " + body.getUsername() + "\nPassword: " + body.getPassword() + "\nId: " + id;
    }
     */

    @PostMapping("/{id}")
    public String PostParamHWorld(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "none") String filter, @RequestBody User body) {
        return "Filter: " + filter;
    }

}