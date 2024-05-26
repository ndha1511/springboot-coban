package com.code.springbootcoban.controllers;

import com.code.springbootcoban.services.interfaces.HelloService;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloController {
    @Autowired
    private HelloService helloService;
    @GetMapping("")
    public String sayHello(@Parameter String text, @RequestParam(required = false, defaultValue = "world") String num) {
        return helloService.sayString(text);
    }

    @PostMapping("/post")
    public String save(@Parameter String text, @Parameter int num) {
        return text + num;
    }

    @PutMapping("/{id}")
    public int update(@PathVariable int id) {
        return id;
    }
}
