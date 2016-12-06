package com.projetESAIP.metier.acceuil.service;

import com.projetESAIP.data.acces.ClasseDao;
import com.projetESAIP.data.entite.Classe;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service(value = "acceuilService")
public class ClasseService {
    @Resource
    private ClasseDao classeDao;

    public ArrayList<Classe> getClasses() {
        return classeDao.findAll();
    }

    public Classe getClasseById(Integer id) {
        return classeDao.findOne(id);
    }
}