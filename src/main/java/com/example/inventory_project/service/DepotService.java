package com.example.inventory_project.service;

import com.example.inventory_project.entity.Depot;
import com.example.inventory_project.repository.DepotRepository;
import org.springframework.stereotype.Service;

@Service
public class DepotService {
    private final DepotRepository depotRepository;
    public DepotService(DepotRepository depotRepository){
        this.depotRepository = depotRepository;
    }
    public Depot addDepot(Depot depot){
        return depotRepository.save(depot);
    }
}
