package com.projetESAIP.data;


import com.projetESAIP.data.entite.*;

public class Populator {

    Classe createClasse() {
        Classe classe = new Classe();
        classe.setNom("CPI M1");

        return classe;
    }


    Eleve createEleveforClasse() {
        Eleve eleve = new  Eleve();
        eleve.setNom("Smith");

        return eleve;
    }
}
