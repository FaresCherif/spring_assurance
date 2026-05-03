package com.example.spring_assurance.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_assurance.Model.Contrat;
import com.example.spring_assurance.repository.ContratRepository;

@Service
public class ContratService {
    
    @Autowired
    private ContratRepository contratRepository;

    public List<Contrat> getAll(){
        return contratRepository.findAll();
    }

    public Contrat get(Long id){
        return contratRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Contrat not found"));
    }
}
