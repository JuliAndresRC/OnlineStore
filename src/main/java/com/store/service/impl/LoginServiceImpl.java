package com.store.service.impl;

import com.store.DTO.LoginDTO;
import com.store.DTO.TokenDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.StreamSupport;
import com.store.service.*;
import com.store.repository.*;

@AllArgsConstructor
@Service
public class LoginServiceImpl implements LoginService {

    private final UserRepository userRepository;


    @Override
    public TokenDTO login(LoginDTO loginDTO) {
        return null;
    }
}