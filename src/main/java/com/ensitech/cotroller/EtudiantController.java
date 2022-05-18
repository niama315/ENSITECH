package com.ensitech.cotroller;

import com.ensitech.model.Etudiant;
import com.ensitech.repository.EtudiantRepository;
import com.ensitech.repository.EtudierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class EtudiantController {

    @Autowired
    EtudiantRepository etudiantRepository;


    @PostMapping("/addEtudiant")
    RedirectView addEtudiant(Model model, @RequestParam(name = "name") String name, @RequestParam(name = "email") String email,
                       @RequestParam(name = "adress") String adress, @RequestParam(name = "tele") String tele){

        Etudiant etudiant = new Etudiant(name, email, adress, tele);
        etudiantRepository.save(etudiant);
        return new RedirectView("/home");

    }

    @GetMapping("/delete")
    RedirectView delete(@RequestParam(name = "id") Long id){
        etudiantRepository.deleteById(id);
        return new RedirectView("/home");
    }
}
