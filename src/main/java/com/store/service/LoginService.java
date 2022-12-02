package com.store.service;

import com.store.DTO.LoginDTO;
import com.store.DTO.TokenDTO;
import org.springframework.web.bind.annotation.RequestBody;

public interface LoginService {

    TokenDTO login(@RequestBody LoginDTO loginDTO);
}
