package com.projetESAIP.data;

import com.projetESAIP.data.entites.Classe;
import com.projetESAIP.data.entites.Eleve;
import com.projetESAIP.data.entites.Idea;

import java.util.ArrayList;

public class Populator {
    private static Populator populator;

    private Populator() {
    }

    public static Populator getPopulator() {
        if (populator == null) {
            populator = new Populator();
        }
        return populator;
    }

    public ArrayList<Eleve> createM2Eleves() {
        ArrayList eleves = new ArrayList();

        eleves.add(this.createEleveWithName("ANDRE", "Pierre"));
        eleves.add(this.createEleveWithName("Donio", "Antonin"));
        eleves.add(this.createEleveWithName("JEAN", "Jack"));

        return eleves;
    }

    public ArrayList<Eleve> createM1Eleves() {
        ArrayList eleves = new ArrayList();

        eleves.add(this.createEleveWithName("JACKY", "Pierre"));
        eleves.add(this.createEleveWithName("DENIAU", "Antonin"));
        eleves.add(this.createEleveWithName("JEAN", "Paul"));

        return eleves;
    }

    Classe createClasseWithName(String name) {
        Classe classe = new Classe();
        classe.setNom(name);

        return classe;
    }

    Eleve createEleveWithName(String firstname, String lastname) {
        Eleve eleve = new Eleve();
        eleve.setNom(firstname);
        eleve.setPrenom(lastname);

        return eleve;
    }

    public Idea createIdea(Eleve el){
        Idea idea = new Idea("Demonstration","Demonstration des idées",el);
        return idea;
    }
}
