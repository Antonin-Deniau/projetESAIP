package com.projetESAIP.metier.acceuil.communication;

import com.projetESAIP.data.entite.Classe;
import com.projetESAIP.metier.acceuil.service.AcceuilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class AcceuilController {
  @Autowired
  public AcceuilController(AcceuilService acceuilService) {
    this.acceuilService = acceuilService;
  }

  final AcceuilService acceuilService;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String acceuil(Map<String, ArrayList<Classe>> model) {
    ArrayList<Classe> classes = acceuilService.getClasses();

    model.put("classes", classes);

    return "home";
  }
}
