package com.example.inventory_project.controller;

import com.example.inventory_project.entity.SSU;
import com.example.inventory_project.service.SSUService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SSUController {
    private final SSUService ssuService;
    public SSUController(SSUService ssuService){
        this.ssuService = ssuService;
    }
    @PostMapping("/addSSU")
    public ResponseEntity<SSU> addSSU(@RequestBody SSU ssu){
        return new ResponseEntity<SSU>(ssuService.addSSU(ssu), HttpStatus.CREATED);
    }
}
