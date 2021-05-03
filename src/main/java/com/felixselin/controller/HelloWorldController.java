package com.felixselin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HelloWorldController {
    @GetMapping
    public String hello(
            @CookieValue(name = "username", defaultValue = "world") String name,
            Model model
    ) {
        model.addAttribute("name", name);
        return "hello";
    }

    @PostMapping
    public String setUsername(
            HttpServletResponse response,
            @RequestParam(required = false, defaultValue = "world") String name,
            Model model
    ) {
        Cookie cookie = new Cookie("username", name);
        response.addCookie(cookie);
        model.addAttribute("name", name);
        return "hello";
    }

    @PostMapping("/logout")
    public String logout(
            HttpServletResponse response,
            Model model
    ) {
        Cookie cookie = new Cookie("username", null);
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        model.addAttribute("name", "world");
        return "redirect:/";
    }

}
