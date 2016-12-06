package com.projetESAIP.metier.acceuil.communication;

import com.projetESAIP.data.entite.Classe;
import com.projetESAIP.metier.acceuil.service.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class ClasseController {
  @Autowired
  public ClasseController(ClasseService classeService) {
    this.classeService = classeService;
  }

  final ClasseService classeService;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String classes(ModelMap model) {
    model.put("classes", classeService.getClasses());
    return "classes";
  }
}