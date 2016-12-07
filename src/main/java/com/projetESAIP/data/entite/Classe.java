package com.projetESAIP.data.entite;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Classe {
    @Id
    @GeneratedValue
    private Integer id;
    private String nom;
    @OneToMany
    @JoinColumn(name = "pizzas", referencedColumnName = "id")
    private ArrayList<Eleve> eleves;

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
