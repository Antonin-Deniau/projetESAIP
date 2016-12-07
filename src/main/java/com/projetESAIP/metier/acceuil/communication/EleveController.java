package com.projetESAIP.metier.acceuil.communication;

import com.projetESAIP.data.entites.Classe;
import com.projetESAIP.domain.services.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EleveController {
    final ClasseService classeService;

    @Autowired
    public EleveController(ClasseService classeService) {
        this.classeService = classeService;
    }

    @RequestMapping(value = "/classes/{id}", method = RequestMethod.GET)
    public String eleves(ModelMap model, @PathVariable("id") Integer id) {
        Classe classe = this.classeService.getClasseById(id);
        model.put("classe", classe);
        return "eleves";
    }
}