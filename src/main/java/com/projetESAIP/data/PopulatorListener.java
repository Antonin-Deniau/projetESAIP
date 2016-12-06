package com.projetESAIP.data;

import com.projetESAIP.data.acces.ClasseDao;
import com.projetESAIP.data.entite.Classe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class PopulatorListener implements ApplicationListener<ContextRefreshedEvent> {

    private final ClasseDao dao;
    private boolean alreadyPopulated = false;

    @Autowired
    public PopulatorListener(ClasseDao dao) {
        this.dao = dao;
    }

    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (!alreadyPopulated) {
            Populator populator = Populator.getPopulator();

            Classe m1 = populator.createClasseWithName("M1");
            Classe m2 = populator.createClasseWithName("M2");

            m1.setEleves(populator.createM1Eleves());
            m2.setEleves(populator.createM2Eleves());

            dao.save(m2);
            dao.save(m1);

            alreadyPopulated = true;
        }
    }
}