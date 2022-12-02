package com.store.controller;

import com.store.api.ViewControl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@AllArgsConstructor
public class ViewController implements ViewControl {

    @Override
    public String indexStore(Model model) {
        return "index";
    }

    @Override
    public String openCartShop(Model model) {
        return "cart-shop";
    }
}
