package com.projetESAIP.data;

import com.projetESAIP.data.daos.ClasseDao;
import com.projetESAIP.data.daos.IdeaDao;
import com.projetESAIP.data.entites.Classe;
import com.projetESAIP.data.entites.Idea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class PopulatorListener implements ApplicationListener<ContextRefreshedEvent> {

    private final ClasseDao dao;
    private final IdeaDao daoIdea;
    private boolean alreadyPopulated = false;

    @Autowired
    public PopulatorListener(ClasseDao dao, IdeaDao daoIdea) {
        this.dao = dao;
        this.daoIdea = daoIdea;
    }

    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (!alreadyPopulated) {
            Populator populator = Populator.getPopulator();

            Classe m1 = populator.createClasseWithName("M1");
            Classe m2 = populator.createClasseWithName("M2");

            m1.setEleves(populator.createM1Eleves());
            m2.setEleves(populator.createM2Eleves());

            Idea idea = populator.createIdea(m1.getEleves().get(0));

            dao.save(m2);
            dao.save(m1);
            daoIdea.save(idea);

            alreadyPopulated = true;
        }
    }
}