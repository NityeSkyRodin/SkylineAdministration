package com.Skyline.SKLNAdministration.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class WorkerController {

    @GetMapping("/worker")
    public String index(Model model, HttpSession httpSession) {

        if (httpSession.getAttribute("Email") != null) {
            model.addAttribute("valueName", "SKLN Administration");
            model.addAttribute("valueRol", "Werknemer");
            model.addAttribute("valueId", "1");
            model.addAttribute("valueEmail", "SKLN@SKLN.SKLN");
            return "index";
        }
            return "redirect:/";
    }

    @PostMapping("/worker")
    public String index(HttpSession httpSession, HttpServletRequest request){
    httpSession = request.getSession(false);
    httpSession.setAttribute("Email", null);
    return "redirect:/";
    }

}