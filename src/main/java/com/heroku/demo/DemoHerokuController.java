package com.heroku.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoHerokuController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World 2021 !!!";
    }
}
