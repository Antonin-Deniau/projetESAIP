package com.projetESAIP.domain.controllers;

import com.projetESAIP.data.entites.Classe;
import com.projetESAIP.domain.services.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
    final ClasseService classeService;

    @Autowired
    public WelcomeController(ClasseService classeService) {
        this.classeService = classeService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String chooseClasse(ModelMap model) {
        model.put("classes", classeService.getClasses());
        return "classes";
    }

    @RequestMapping(value = "/classes/{id}", method = RequestMethod.GET)
    public String chooseEleve(ModelMap model, @PathVariable("id") Integer id) {
        Classe classe = this.classeService.getClasseById(id);
        model.put("classe", classe);
        return "eleves";
    }
}