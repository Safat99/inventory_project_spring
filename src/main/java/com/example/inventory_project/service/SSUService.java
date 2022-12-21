package com.example.inventory_project.service;

import com.example.inventory_project.entity.Depot;
import com.example.inventory_project.entity.SSU;
import com.example.inventory_project.repository.SSURepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SSUService {
    private final SSURepository ssuRepository;
    public SSUService(SSURepository ssuRepository){
        this.ssuRepository = ssuRepository;
    }
    public SSU addSSU(SSU ssu){
        return ssuRepository.save(ssu);
    }

    public SSU editSSU(Long id, SSU givenSSU){
        Optional<SSU> ssu = ssuRepository.findById(id);
        if (ssu.isPresent()){
            SSU changeSSU = ssu.get();
            changeSSU.setSsu_name(givenSSU.getSsu_name());
            changeSSU.setLocation(givenSSU.getLocation());
            ssuRepository.save(changeSSU);
            return changeSSU;
        }
        else{
            System.out.println("Invalid Id given");
            return null;
        }
    }
}
