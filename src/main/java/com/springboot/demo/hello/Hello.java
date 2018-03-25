package com.springboot.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/hello")
    public String seyHello() {return "elo";}

    @RequestMapping("/")
    public String startPage() {return "START";}

}
