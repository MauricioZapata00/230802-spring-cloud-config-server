package com.dummy.spring.cloud.client.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path = "/client-1")
public class MessageController {


    @Value("${message}")
    private String message;

    @Value("${secrets.value}")
    private String secret;

    @GetMapping("/message")
    public ResponseEntity<String> getMessage(){
        return ResponseEntity.ok(this.message);
    }

    @GetMapping("/secret")
    public String getSecretValue(){
        return this.secret;
    }

}
