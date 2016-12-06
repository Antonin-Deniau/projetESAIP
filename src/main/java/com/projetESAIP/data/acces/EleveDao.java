package com.projetESAIP.data.acces;

import com.projetESAIP.data.entite.Classe;
import com.projetESAIP.data.entite.Eleve;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface EleveDao extends CrudRepository<Eleve, Integer> {
    ArrayList<Eleve> findByClasse(Classe classe);
}