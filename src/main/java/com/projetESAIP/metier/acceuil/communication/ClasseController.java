package com.projetESAIP.metier.acceuil.communication;

import com.projetESAIP.metier.acceuil.service.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClasseController {
    final ClasseService classeService;

    @Autowired
    public ClasseController(ClasseService classeService) {
        this.classeService = classeService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String classes(ModelMap model) {
        model.put("classes", classeService.getClasses());
        return "classes";
    }
}