package com.example.demo_second.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo_second.model.SignUpReq;

@Service
public class LoginService {

    private final RestTemplate restTemplate;

    @Value("${projectB.base-url}")
    private String projectBBaseUrl;

    public LoginService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String signUp(SignUpReq req) {
        String url = projectBBaseUrl + "/v1/user/signup";

        return restTemplate.postForObject(url, req, String.class);
    }

}
