package com.projetESAIP.domain.services;

import com.projetESAIP.data.daos.ClasseDao;
import com.projetESAIP.data.daos.EleveDao;
import com.projetESAIP.data.entites.Classe;
import com.projetESAIP.data.entites.Eleve;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service(value = "eleveService")
public class EleveService {
    @Resource
    private EleveDao eleveDao;

    public ArrayList<Eleve> getEleves() {
        return eleveDao.findAll();
    }

    public Eleve getEleveById(Integer id) {
        return eleveDao.findOne(id);
    }
}