package com.ensitech.cotroller;

import com.ensitech.model.Etudiant;
import com.ensitech.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class Home {

    @Autowired
    EtudiantRepository etudiantRepository;


    @GetMapping("/home")
    String home(Model model){

        List<Etudiant> etudiants = etudiantRepository.findAll();
        model.addAttribute("etudiants", etudiants);
        return "home";

    }

}
