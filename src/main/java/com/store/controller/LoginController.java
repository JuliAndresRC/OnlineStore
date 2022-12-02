package com.store.controller;

import com.store.DTO.LoginDTO;
import com.store.DTO.TokenDTO;
import com.store.api.LoginAPI;
import com.store.service.LoginService;
import com.store.validation.EmailValidator;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class LoginController implements LoginAPI {

    private final LoginService loginService;

    @Override
    public TokenDTO login(LoginDTO loginDTO) {
        String s = loginDTO.getEmail();
        EmailValidator emailValidator = new EmailValidator();

        if (emailValidator.isValid(s, null)) {
            return loginService.login(loginDTO);
        }

        return null;
    }
}
