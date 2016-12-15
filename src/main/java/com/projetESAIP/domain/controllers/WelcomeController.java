package com.projetESAIP.domain.controllers;

import com.projetESAIP.domain.services.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
    final IdeaService ideaService;

    @Autowired
    public WelcomeController(IdeaService ideaService) {
        this.ideaService = ideaService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String thanks(ModelMap model) {
        model.put("ideas",ideaService.getIdeas());
        return "home";
    }
}
