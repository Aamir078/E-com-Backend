package com.Aamir.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** @Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody              responsebody return pages but we want to return data not page
    public String greet (){
        return "welcome to my server";
    }
}
 **/


@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet (){
        return "welcome to my server...";
    }

    @RequestMapping("/about")
    public String about(){
        return "this website is currently in building progress";
    }
}
