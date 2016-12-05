package com.projetESAIP.data.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;

@Entity
public class Classe {
    @Id @GeneratedValue private Integer id;
    private String nom;
    //@OneToMany(referencedColumnName = "id")
    //private ArrayList<Eleve> eleves;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
