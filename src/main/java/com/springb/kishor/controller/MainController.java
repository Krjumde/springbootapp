package com.springb.kishor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/alluser")
    public String hello(){

        return "Welcome  All ";

    }
    @RequestMapping("/admin")
    public String admin(){

        return "Welcome  Admin ";

    }
}