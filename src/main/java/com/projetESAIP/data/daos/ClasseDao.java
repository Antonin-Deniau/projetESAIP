package com.projetESAIP.data.daos;

import com.projetESAIP.data.entites.Classe;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ClasseDao extends CrudRepository<Classe, Integer> {
    ArrayList<Classe> findAll();
}