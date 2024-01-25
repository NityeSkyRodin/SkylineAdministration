package com.Skyline.SKLNAdministration.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Skyline.DTO.LoginDTO;
import com.Skyline.SKLNAdministration.Service.LoginService;

import jakarta.servlet.http.HttpSession;


@Controller
public class LoginController {

    LoginService loginService = new LoginService();
    HttpSession httpSession;
    @GetMapping("/")
    public String index(Model model, HttpSession httpSession){
        if(httpSession.getAttribute("Email") == null){
            model.addAttribute("loginObject", new LoginDTO());
            return "login";
        }
        return "redirect:worker";
    }

    @PostMapping("/")
    public String index(@ModelAttribute("loginObject") LoginDTO loginDTO,HttpSession httpSession){
        if (loginService.checkLogin(loginDTO.getEmail(),loginDTO.getPassword())) {
            httpSession.setAttribute("Email", loginDTO.getEmail());
            return "redirect:worker";
        }
            return "login";
    }

}