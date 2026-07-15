package com.cognizant.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.AuthenticationResponse;
import com.cognizant.util.JwtUtil;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization") String authorizationHeader) {

        String base64Credentials = authorizationHeader.substring(6);

        byte[] decoded = Base64.getDecoder().decode(base64Credentials);

        String credentials = new String(decoded, StandardCharsets.UTF_8);

        String username = credentials.split(":")[0];

        UserDetails user = User.withUsername(username)
                .password("")
                .roles("USER")
                .build();

        String token = jwtUtil.generateToken(user);

        return new AuthenticationResponse(token);
    }
    @GetMapping("/test")
    public String test() {
        return "Working";
    }
    
}