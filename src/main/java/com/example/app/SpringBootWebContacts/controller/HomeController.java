package com.example.app.SpringBootWebContacts.controller;

import com.example.app.SpringBootWebContacts.service.ContactService;
import com.example.app.SpringBootWebContacts.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.net.URISyntaxException;

@Controller
public class HomeController {
    @Autowired
    ContactService contactService;
    @Autowired
    ManagerService managerService;
    @GetMapping("/")
    public String getHome(Model model) throws URISyntaxException, IOException {
        model.addAttribute("contacts",contactService.getTours());
        model.addAttribute("managers", managerService.getManager());
        return "home";
    }
}
