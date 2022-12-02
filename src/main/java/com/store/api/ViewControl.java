package com.store.api;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/store")
public interface ViewControl {

    @GetMapping
    public String indexStore(Model model);

    @GetMapping("/cartshop")
    public String openCartShop(Model model);

}