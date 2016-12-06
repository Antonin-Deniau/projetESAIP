package com.projetESAIP.data;

import com.projetESAIP.data.entite.*;
import java.util.ArrayList;

public class Populator {
    private static Populator populator;

    public static Populator getPopulator() {
        if (populator == null) {
            populator = new Populator();
        }
        return populator;
    }

    public ArrayList<Eleve> createM2Eleves() {
        ArrayList eleves = new ArrayList();

        eleves.add(this.createEleveWithName("Andre", "Piere"));
        eleves.add(this.createEleveWithName("Donio", "Antonin"));
        eleves.add(this.createEleveWithName("Jean", "jak"));

        return eleves;
    }

    public ArrayList<Eleve> createM1Eleves() {
        ArrayList eleves = new ArrayList();

        eleves.add(this.createEleveWithName("Jacky", "Piere"));
        eleves.add(this.createEleveWithName("DENIAU", "Antonin"));
        eleves.add(this.createEleveWithName("Jean", "Paul"));

        return eleves;
    }

    Classe createClasseWithName(String name) {
        Classe classe = new Classe();
        classe.setNom(name);

        return classe;
    }

    Eleve createEleveWithName(String firstname, String lastname) {
        Eleve eleve = new  Eleve();
        eleve.setNom(firstname);
        eleve.setPrenom(lastname);

        return eleve;
    }
}
