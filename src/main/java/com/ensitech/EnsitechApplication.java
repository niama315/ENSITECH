package com.ensitech;

import com.ensitech.model.Etudiant;
import com.ensitech.model.User;
import com.ensitech.repository.EtudiantRepository;
import com.ensitech.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnsitechApplication implements CommandLineRunner {

    @Autowired
    EtudiantRepository etudiantRepository;

    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(EnsitechApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User niama = new User("niama", "password", "ADMIN");

        userRepository.save(niama);
    }
}
