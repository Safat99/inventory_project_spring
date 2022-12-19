package com.example.inventory_project.controller;

import com.example.inventory_project.DTO.BudgetDTO;
import com.example.inventory_project.service.BudgetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BudgetController {
    private final BudgetService budgetService;

    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }


    ////////////////////////////////////////// read from excel /////////////////////////////////////////////
    @GetMapping("/showAllFromExcel")
    public ResponseEntity<List<BudgetDTO>> getAllEmployeesFromExcel(){
        return new ResponseEntity<List<BudgetDTO>>(budgetService.getAllBudgetFromExcel(), HttpStatus.OK);
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////

    /////////////////////////////// add db from excel ///////////////////////////////////////
//    @PostMapping("/addBudgetFromExcel")
//    public ResponseEntity<List<BudgetDTO>> addBudgetDTOFromExcel(){
//        return new ResponseEntity<>(budgetService.addBudgetFromExcel(),HttpStatus.CREATED);
//    }

}
