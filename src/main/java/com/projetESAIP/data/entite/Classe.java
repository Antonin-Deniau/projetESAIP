package com.projetESAIP.data.entite;

import javax.persistence.*;
import java.util.List;

@Entity
public class Classe {
    @Id
    @GeneratedValue
    private Integer id;
    private String nom;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Eleve> eleves;

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

    public List<Eleve> getEleves() {
        return eleves;
    }

    public void setEleves(List<Eleve> eleves) {
        this.eleves = eleves;
    }

    public void addEleve(Eleve eleve) {
        this.eleves.add(eleve);
    }
}
