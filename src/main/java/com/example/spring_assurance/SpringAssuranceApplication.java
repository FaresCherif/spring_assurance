package com.example.spring_assurance;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.spring_assurance.Model.Contrat;
import com.example.spring_assurance.repository.ContratRepository;

@SpringBootApplication
public class SpringAssuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAssuranceApplication.class, args);
	}


	@Bean
    public CommandLineRunner demo(ContratRepository repository) {
        return (args) -> {
            // save a few customers
			repository.save(new Contrat ("AUT-20241", "Renault Clio IV", "Auto", "Actif", "Jean Dupont", 420, "2025-12-31"));
			repository.save(new Contrat("HAB-20189", "Appartement Paris 11e", "Habitation", "Actif", "Marie Martin", 280, "2025-06-30"));
			repository.save(new Contrat("SAN-30872", "Mutuelle Confort+", "Santé", "Résilié", "Paul Bernard", 150, "2024-03-15"));
			repository.save(new Contrat("AUT-20455", "Peugeot 308 II", "Auto", "Actif", "Sophie Leclerc", 510, "2026-01-20"));

		};
	}
}

