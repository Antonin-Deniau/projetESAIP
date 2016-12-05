package com.projetESAIP.data.acces;

import com.projetESAIP.data.entite.Classe;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ClasseDao extends CrudRepository<Classe, Long> {
    ArrayList<Classe> findAll();
}