package com.store.controller;

import com.store.api.ViewControl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@AllArgsConstructor
public class ViewController implements ViewControl {

    @Override
    public String login(Model model) {
        return "login";
    }

    @Override
    public String openCartShop(Model model) {
        return "cart-shop";
    }
}
