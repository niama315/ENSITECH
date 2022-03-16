package com.ensitech.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Ecole {
    @Id
    private Long id;
    private String nom;
    private String email;
    private String adress;
    private String tele;
    private String directeur;
}
