package com.cognizant.service;

import org.springframework.stereotype.Service;

import com.cognizant.util.JwtUtil;

@Service
public class AuthenticationService {

    private JwtUtil jwtUtil = new JwtUtil();

    public String authenticate(String username, String password) {

        if ("admin".equals(username) && "admin".equals(password)) {
            return jwtUtil.generateToken(username);
        }

        return "Invalid Credentials";
    }
}