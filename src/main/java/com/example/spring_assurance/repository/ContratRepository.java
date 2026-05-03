package com.example.spring_assurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_assurance.Model.Contrat;

public interface ContratRepository extends JpaRepository<Contrat,Long> {
    
}
