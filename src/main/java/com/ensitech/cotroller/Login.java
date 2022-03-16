package com.ensitech.cotroller;

import com.ensitech.model.User;
import com.ensitech.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller()
public class Login {

    @Autowired
    UserRepository userRepository;


    @GetMapping("/login")
    String login(){
        return "login";
    }

    @PostMapping("/login")
    String create(@RequestParam(name = "username") String  username, @RequestParam(name = "password") String password){

        User user = userRepository.findByUsername(username).get(0);
        if (user.getPasword().equals(password)){
            if (user.getRole().equals("RESP"))
            return "home";
            else return "home";
        }else return "index";

    }


}
