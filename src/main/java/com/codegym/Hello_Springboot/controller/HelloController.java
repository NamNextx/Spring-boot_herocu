package com.codegym.Hello_Springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public ModelAndView modelAndView(){
        ModelAndView modelAndView = new ModelAndView("/hello");
        return modelAndView;
    }
}
