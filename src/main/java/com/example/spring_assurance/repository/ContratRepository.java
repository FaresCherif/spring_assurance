package com.example.spring_assurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_assurance.Model.Contrat;

public interface ContratRepository extends JpaRepository<Contrat,Long> {
    
    List<Contrat> findByStatut(String statut);
    List<Contrat> findAllByOrderByStatutAsc();
}
