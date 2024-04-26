package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping(value = "/")
    public static String Welcome(){
        return "Hello this is a String \n " +
                "Duy Vu Dinh";
    }
}
