package com.ensitech.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Etudier {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
//    @OneToOne(mappedBy = "id")
//    private Etudiant etudiant;
//    @OneToOne(mappedBy = "id")
//    private Cours cours;
}
