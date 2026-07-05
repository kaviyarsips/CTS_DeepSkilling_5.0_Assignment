package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.AuthenticationRequest;
import com.cognizant.model.AuthenticationResponse;
import com.cognizant.service.AuthenticationService;

@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestBody AuthenticationRequest request) {

        String token = authenticationService.authenticate(
                request.getUsername(),
                request.getPassword());

        return new AuthenticationResponse(token);
    }
}