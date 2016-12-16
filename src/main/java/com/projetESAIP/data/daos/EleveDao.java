package com.projetESAIP.data.daos;

import com.projetESAIP.data.entites.Classe;
import com.projetESAIP.data.entites.Eleve;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface EleveDao extends CrudRepository<Eleve, Integer> {
    ArrayList<Eleve> findAll();
}