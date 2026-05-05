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
			repository.save(new Contrat("AUT-20241", "Renault Clio IV", "Auto", "Actif", "Jean Dupont", 420, "2025-12-31"));
			repository.save(new Contrat("HAB-20189", "Appartement Paris 11e", "Habitation", "Actif", "Marie Martin", 280, "2025-06-30"));
			repository.save(new Contrat("SAN-30872", "Mutuelle Confort+", "Santé", "Résilié", "Paul Bernard", 150, "2024-03-15"));
			repository.save(new Contrat("AUT-20455", "Peugeot 308 II", "Auto", "Actif", "Sophie Leclerc", 510, "2026-01-20"));
			repository.save(new Contrat("HAB-30421", "Maison Lyon 6e", "Habitation", "Actif", "Thomas Moreau", 380, "2026-03-15"));
			repository.save(new Contrat("SAN-40231", "Mutuelle Famille Plus", "Santé", "Actif", "Claire Petit", 320, "2026-05-01"));
			repository.save(new Contrat("AUT-30987", "BMW Série 3", "Auto", "Résilié", "Lucas Bernard", 680, "2024-08-20"));
			repository.save(new Contrat("HAB-40123", "Studio Bordeaux Centre", "Habitation", "Résilié", "Emma Dubois", 190, "2024-11-30"));
			repository.save(new Contrat("SAN-50341", "Mutuelle Senior Confort", "Santé", "Actif", "Michel Lambert", 410, "2026-07-15"));
			repository.save(new Contrat("AUT-41233", "Volkswagen Golf VIII", "Auto", "Actif", "Camille Rousseau", 390, "2026-02-28"));
			repository.save(new Contrat("HAB-50987", "Villa Marseille 8e", "Habitation", "Actif", "Antoine Girard", 620, "2026-09-10"));
			repository.save(new Contrat("SAN-60123", "Mutuelle Essentielle", "Santé", "Résilié", "Julie Leroy", 95, "2023-12-31"));
			repository.save(new Contrat("AUT-52341", "Tesla Model 3", "Auto", "Actif", "Hugo Fontaine", 750, "2026-11-15"));
			repository.save(new Contrat("HAB-61234", "Appartement Nantes 44", "Habitation", "Actif", "Léa Mercier", 240, "2026-04-30"));
			repository.save(new Contrat("SAN-70456", "Mutuelle Premium", "Santé", "Actif", "Pierre Blanchard", 520, "2026-08-01"));

		};
	}
}

