package com.spring.uchugmae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    


    @GetMapping("/main")
    public String main(){
        return "index/main";
    }
    

}

