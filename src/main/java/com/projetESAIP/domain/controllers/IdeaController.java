package com.projetESAIP.domain.controllers;

import com.projetESAIP.data.entites.Classe;
import com.projetESAIP.data.entites.Eleve;
import com.projetESAIP.data.entites.Idea;
import com.projetESAIP.domain.services.ClasseService;
import com.projetESAIP.domain.services.IdeaService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class IdeaController {
    final ClasseService classeService;
    final IdeaService ideaService;

    @Autowired
    public IdeaController(ClasseService classeService, IdeaService ideaService) {
        this.classeService = classeService;
        this.ideaService = ideaService;
    }

    @RequestMapping(value = "/classes", method = RequestMethod.GET)
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

    @RequestMapping(value = "/classes/{id_cl}/eleves/{id_el}", method = RequestMethod.GET)
    public String enterIdea(ModelMap model, @PathVariable("id_cl") Integer id_cl, @PathVariable("id_el") Integer id_el) {
        return "idea";
    }

    @RequestMapping(value = "/thanks", method = RequestMethod.POST)
    public String thanks(@RequestParam(value = "title_idea") String title,@RequestParam(value = "desc_idea") String desc, ModelMap model) {
        Idea idea = new Idea();
        idea.setTitle(title);
        idea.setDescription(desc);
        ideaService.addIdea(idea);
        return "thanks";
    }
}