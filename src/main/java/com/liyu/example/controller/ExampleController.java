package com.liyu.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by twcn on 10/2/16.
 */
@RestController
public class ExampleController {
    @RequestMapping("/greeting/{name}")
    public String greeting(@PathVariable("name") String name){
        return "hello " + name;
    }
}
