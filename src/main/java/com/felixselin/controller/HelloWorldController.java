package com.felixselin.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    @GetMapping
    public String hello(
            @RequestParam(required = false, defaultValue = "world") String name,
            Model model
    ) {
        model.addAttribute("name", name);
        return "hello";
    }

    @PostMapping
    public String helloUser(
            @RequestParam(required = false, defaultValue = "world") String name,
            Model model
    ) {
        model.addAttribute("name", name);
        return "hello";
    }

}
