package com.example.inventory_project.controller;

import com.example.inventory_project.entity.Depot;
import com.example.inventory_project.entity.SSU;
import com.example.inventory_project.service.SSUService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/SSU")
public class SSUController {
    private final SSUService ssuService;
    public SSUController(SSUService ssuService){
        this.ssuService = ssuService;
    }
    @PostMapping("/addSSU")
    public ResponseEntity<SSU> addSSU(@RequestBody SSU ssu){
        return new ResponseEntity<SSU>(ssuService.addSSU(ssu), HttpStatus.CREATED);
    }
    @PutMapping("/editSSU/{id}")
    public ResponseEntity<SSU> editSSU(@PathVariable("id") Long id, @RequestBody SSU ssu){
        return new ResponseEntity<SSU>(ssuService.editSSU(id,ssu), HttpStatus.OK);
    }
}
