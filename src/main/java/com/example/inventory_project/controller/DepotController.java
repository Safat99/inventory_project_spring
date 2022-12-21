package com.example.inventory_project.controller;

import com.example.inventory_project.entity.Depot;
import com.example.inventory_project.service.DepotService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/depot")
public class DepotController {
    private final DepotService depotService;

    public DepotController(DepotService depotService){
        this.depotService = depotService;
    }

    /**
     * add depots
     * @param depot something
     * @return something
     */
    @PostMapping("/addDepot")
    public ResponseEntity<Depot> addDepot(@RequestBody Depot depot){
        return new ResponseEntity<Depot>(depotService.addDepot(depot), HttpStatus.CREATED);
    }

    @PostMapping("/addDepotMain")
    public ResponseEntity<Depot> addDepotMain(@RequestBody Depot depot){
        return new ResponseEntity<Depot>(depotService. addDepotMain(depot), HttpStatus.CREATED);
    }

    @PutMapping("/editDepot/{id}")
    public ResponseEntity<Depot> editDepot(@PathVariable("id") Long id, @RequestBody Depot depot){
        return new ResponseEntity<Depot>(depotService.editDepot(id,depot), HttpStatus.OK);
    }

}
