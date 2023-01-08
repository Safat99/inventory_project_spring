package com.example.inventory_project.controller;

import com.example.inventory_project.DTO.EmailDetailsDTO;
import com.example.inventory_project.service.EmailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {
    private final EmailService emailService;

    public EmailController(EmailService emailService){
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendMail(@RequestBody EmailDetailsDTO emailDetailsDTO){
        return new ResponseEntity<String>(emailService.sendMail(emailDetailsDTO), HttpStatus.OK);
    }
}



