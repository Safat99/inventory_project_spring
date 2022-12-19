package com.example.inventory_project.controller;

import com.example.inventory_project.entity.Depot;
import com.example.inventory_project.service.DepotService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepotController {
    private final DepotService depotService;
    public DepotController(DepotService depotService){
        this.depotService = depotService;
    }
    @PostMapping("/addDepot")
    public ResponseEntity<Depot> addDepot(@RequestBody Depot depot){
        return new ResponseEntity<Depot>(depotService.addDepot(depot), HttpStatus.CREATED);
    }

}
