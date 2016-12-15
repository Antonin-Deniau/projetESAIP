package com.projetESAIP.domain.services;

import com.projetESAIP.data.daos.ClasseDao;
import com.projetESAIP.data.entites.Classe;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service(value = "classeService")
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