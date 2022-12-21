package com.example.inventory_project.service;

import com.example.inventory_project.entity.Depot;
import com.example.inventory_project.repository.DepotRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepotService {
    private final DepotRepository depotRepository;
    public DepotService(DepotRepository depotRepository){
        this.depotRepository = depotRepository;
    }
    public Depot addDepot(Depot depot){
        return depotRepository.save(depot);
    }

    public Depot editDepot(Long id, Depot givenDepot){
        Optional<Depot> depot = depotRepository.findById(id);
        if (depot.isPresent()){
            Depot changeDepot = depot.get();
            changeDepot.setDepotName(givenDepot.getDepotName());
            changeDepot.setLocation(givenDepot.getLocation());
            depotRepository.save(changeDepot);
            return changeDepot;
        }
        else{
            System.out.println("Invalid Id given");
            return null;
        }
    }
}
