package com.projetESAIP.domain.services;

import com.projetESAIP.data.daos.IdeaDao;
import com.projetESAIP.data.entites.Eleve;
import com.projetESAIP.data.entites.Idea;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service(value="ideaService")
public class IdeaService {

    @Resource
    private IdeaDao ideaDao;

    public ArrayList<Idea> getIdeas() { return ideaDao.findAll(); }

    public Idea getIdeaById(Integer id) { return ideaDao.findOne(id); }

    public void addIdea(Idea idea){
        ideaDao.save(idea);
    }
}
