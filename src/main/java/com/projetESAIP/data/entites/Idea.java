package com.projetESAIP.data.entites;

import javax.persistence.*;

@Entity
public class Idea {

    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String description;

    @OneToOne
    @JoinColumn(name="eleve_id")
    private Eleve eleve;

    public Idea() {
    }

    public Idea(String title, String description, Eleve eleve) {
        this.title = title;
        this.description = description;
        this.eleve = eleve;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }
}
