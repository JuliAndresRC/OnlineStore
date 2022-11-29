package com.store.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/store")
@AllArgsConstructor
public class ViewController {

    @GetMapping
    public String login(){
        return " ";
    }
}
