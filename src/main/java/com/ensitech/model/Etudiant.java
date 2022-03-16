package com.ensitech.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String  adress;
    private String tele;
    private String dateNaissance;

    public Etudiant(String nom, String email, String adress, String tele) {
        this.nom = nom;
        this.email = email;
        this.adress = adress;
        this.tele = tele;
    }
}
