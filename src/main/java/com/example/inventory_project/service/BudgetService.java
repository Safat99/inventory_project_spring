package com.example.inventory_project.service;

import com.example.inventory_project.DTO.BudgetDTO;
import com.example.inventory_project.entity.Budget;
import com.poiji.bind.Poiji;
import org.springframework.stereotype.Service;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class BudgetService {

    public List<BudgetDTO> getAllBudgetFromExcel(){
        List<BudgetDTO> budgets = Poiji.fromExcel(new File("sample_budget.xlsx"), BudgetDTO.class);
//        int length = budgets.size();
        return new ArrayList<BudgetDTO>(budgets);
    }
    ///////////////////////////////////////// /////////////////////////////////////////////////////
    public List<Budget> addEmployeeFromExcel(){
        List<BudgetDTO> budgetDTO = Poiji.fromExcel(new File("sample_budget.xlsx"), BudgetDTO.class);
        List<Budget> allBudget = new ArrayList<>();
        int len = budgetDTO.size();
        for (int i=0; i<len;i++){
            BudgetDTO _budgetDTO = budgetDTO.get(i);
            Budget _budget = new Budget();
            _budget.setBudgetID(_budgetDTO.getBudgetID());
            _budget.setCategory(_budgetDTO.getCategory());
            _budget.setDepotID(_budgetDTO.getDepotID());
            _budget.setDepotName(_budget.getDepotName());
            allBudget.add(_budget);
        }
        return allBudget;
    }



}
