package com.Skyline.SKLNAdministration.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WorkerController {

    @GetMapping("/worker")
    public String index(Model model) {
        model.addAttribute("valueName", "SKLN Administration");
        model.addAttribute("valueRol", "Werknemer");
        model.addAttribute("valueId", "1");
        model.addAttribute("valueEmail", "SKLN@SKLN.SKLN");
        return "index";
    }


}