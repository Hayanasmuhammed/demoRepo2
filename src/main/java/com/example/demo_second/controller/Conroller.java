package com.example.demo_second.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_second.model.SignUpReq;
import com.example.demo_second.service.LoginService;

@RestController
public class Conroller {

    @Autowired
    private LoginService loginService;

    @PostMapping("/v1/signUp")
    public String postMethodName(@RequestBody SignUpReq req) {
        // TODO: process POST request

        return loginService.signUp(req);
    }

}
