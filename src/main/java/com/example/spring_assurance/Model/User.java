package com.example.spring_assurance.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String numero;
    private String titre;
    private String type;
    private String statut;
    private String titulaire;
    private Integer prime;
    private String echeance;

    protected User() {
    }

    public User(String numero, String titre, String type, String statut, String titulaire, Integer prime,
            String echeance) {
        this.numero = numero;
        this.titre = titre;
        this.type = type;
        this.statut = statut;
        this.titulaire = titulaire;
        this.prime = prime;
        this.echeance = echeance;
    }

    public User(Long id, String numero, String titre, String type, String statut, String titulaire, Integer prime,
            String echeance) {
        this(numero, titre, type, statut, titulaire, prime, echeance);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public Integer getPrime() {
        return prime;
    }

    public void setPrime(Integer prime) {
        this.prime = prime;
    }

    public String getEcheance() {
        return echeance;
    }

    public void setEcheance(String echeance) {
        this.echeance = echeance;
    }

}
