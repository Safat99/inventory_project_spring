package com.example.inventory_project.service;

import com.example.inventory_project.entity.SSU;
import com.example.inventory_project.repository.SSURepository;
import org.springframework.stereotype.Service;

@Service
public class SSUService {
    private final SSURepository ssuRepository;
    public SSUService(SSURepository ssuRepository){
        this.ssuRepository = ssuRepository;
    }
    public SSU addSSU(SSU ssu){
        return ssuRepository.save(ssu);
    }
}
