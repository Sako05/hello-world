package com.example.ExaminationsuppgiftB2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {

    @GetMapping("/hello")
    public @ResponseBody String hello() {
        return "Hello, World!";
    }
}
