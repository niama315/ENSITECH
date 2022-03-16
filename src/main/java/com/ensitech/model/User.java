package com.ensitech.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String pasword;
    private String role;

    public User(String username, String pasword, String role) {
        this.username = username;
        this.pasword = pasword;
        this.role = role;
    }
}
