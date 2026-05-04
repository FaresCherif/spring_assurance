package com.example.spring_assurance.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_assurance.Model.Contrat;
import com.example.spring_assurance.Service.ContratService;

@RestController
@RequestMapping("/contrat")
public class ContratController {
    
    @Autowired
    private ContratService contratService;

    @GetMapping
    public List<Contrat> getAll(){
        return contratService.getAll();
    }

    @GetMapping("/{id}")
    public Contrat get(@PathVariable Long id){
        return contratService.get(id);
    }

    @GetMapping("/statut/{statut}")
    public List<Contrat> getByStatut(@PathVariable String statut){
        return contratService.getByStatut(statut);
    }

    @PostMapping("/add")
    public Contrat add(@RequestBody Contrat contrat){
        return contratService.save(contrat);

    }
}
