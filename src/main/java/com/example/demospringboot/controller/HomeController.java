package com.example.demospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public static String Welcome(){
        return "Hello this is a String \n " +
                "Duy Vu Dinh";
    }

    @RequestMapping(value = "/home")
    public static String welcome(){
        return "index";
    }
}
