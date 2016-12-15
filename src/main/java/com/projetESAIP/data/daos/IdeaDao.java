package com.projetESAIP.data.daos;

import com.projetESAIP.data.entites.Idea;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface IdeaDao extends CrudRepository<Idea, Integer> {
    ArrayList<Idea> findAll();
}
