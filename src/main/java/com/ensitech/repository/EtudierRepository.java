package com.ensitech.repository;

import com.ensitech.model.Etudier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudierRepository extends JpaRepository<Etudier, Long> {
}
