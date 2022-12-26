package com.example.inventory_project.service;

import com.example.inventory_project.entity.Depot;
import com.example.inventory_project.entity.User;
import com.example.inventory_project.repository.DepotRepository;
import com.example.inventory_project.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepotService {
    private final DepotRepository depotRepository;
    private final UserRepository userRepository;

    public DepotService(DepotRepository depotRepository, UserRepository userRepository){
        this.depotRepository = depotRepository;
        this.userRepository = userRepository;
    }

    public Depot addDepot(Depot depot){
        return depotRepository.save(depot);
    }

    public Depot addDepotMain(Depot getFullDepot){
        Depot depot = new Depot();
        depot.setLocation(getFullDepot.getLocation());
        depot.setDepotName(getFullDepot.getDepotName());
        depot.setUser(getFullDepot.getUser());

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

    public void deleteDepot(Depot _depot){
        depotRepository.delete(_depot);
    }

}
