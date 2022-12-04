package ru.ros.santa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String displayMainPage() {
        return "index";
    }

    @GetMapping("/login")
    public String displayRegPage() {
        String message = "Hello Spring Boot + JSP";

//        model.addAttribute("message", message);
        return "registry";
    }
}
