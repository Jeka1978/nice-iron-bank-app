package com.nice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/api/")
public class HelloController {
    @Autowired
    private PersonDao personDao;


    @GetMapping("hello")
    public String hello() {
        return "Hello";
    }


    @GetMapping("hi/{name}")
    public String hi(@PathVariable String name) {
        return "hello " + name.toUpperCase();

    }

    @GetMapping("hi2")
    public String hi2(@RequestParam("name") String name) {
        return "hello " + name.toLowerCase();
    }


}








