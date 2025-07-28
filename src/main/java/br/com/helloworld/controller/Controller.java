package br.com.helloworld.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello-world")
public class Controller {
    @GetMapping
    public String helloWorld(){
        return "<h1>Hello World</h1>";
    }
}
