package com.projetESAIP.metier.acceuil.communication;

import com.projetESAIP.data.entite.Classe;
import com.projetESAIP.metier.acceuil.service.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EleveController {
    @Autowired
    public EleveController(ClasseService classeService) {
        this.classeService = classeService;
    }

    final ClasseService classeService;

    @RequestMapping(value = "/classes/{id}", method = RequestMethod.GET)
    public String eleves(ModelMap model, @PathVariable("id") Integer id) {
        Classe classe = this.classeService.getClasseById(id);
        model.put("classe", classe);
        return "eleves";
    }
}