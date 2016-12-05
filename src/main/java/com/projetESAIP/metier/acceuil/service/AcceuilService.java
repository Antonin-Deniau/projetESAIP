package com.projetESAIP.metier.acceuil.service;

import com.projetESAIP.data.acces.ClasseDao;
import com.projetESAIP.data.entite.Classe;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service(value = "acceuilService")
public class AcceuilService {
    @Resource
    private ClasseDao classeDao;

    public ArrayList<Classe> getClasses() {
        return classeDao.findAll();
    }

    public void createClasse() {
        Classe classe = new Classe();
        classe.setNom("George");
        classeDao.save(classe);
    }
}