package com.instagram.controller;

import com.instagram.entities.UserEntity;
import com.instagram.repository.UserRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.Normalizer;

@Controller
//@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

//    @PostMapping("/saveData")
//    public String init(Model model){
//        model.addAttribute("userEntity",new UserEntity());
//        return "userForm";
//
//    }

    @PostMapping(value = "/saveData", produces = "application/json")
    public String handleFormData(@RequestBody UserEntity userEntity, HttpServletResponse httpResponse) throws IOException {
        System.out.println("DataForm" + userEntity);
        userRepository.save(userEntity);
        if(userEntity != null) {
            httpResponse.sendRedirect("/");
            return null;
        }
        return "<h1>success: " + userEntity + "</h1>";
//        model.addAttribute("message","User login Successful");
//        return "redirect:/dashboard";
    }
}

