package com.Skyline.SKLNAdministration.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.DTO.LoginDTO;
import com.Skyline.SKLNAdministration.Service.LoginService;


@Controller
public class LoginController {

    LoginService loginService = new LoginService();
    @GetMapping("/login")
    public String index(Model model){
        model.addAttribute("loginObject", new LoginDTO());
        return "login";
    }

    @PostMapping("/login")
    public String index(@ModelAttribute("loginObject") LoginDTO loginDTO){
        if (loginService.checkLogin(loginDTO.getEmail(),loginDTO.getPassword())) {
            return "redirect:worker";
        }
        else{
            return "login";
        }
    }
}