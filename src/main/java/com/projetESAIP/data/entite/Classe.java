package com.projetESAIP.data.entite;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;

@Entity
public class Classe {
    @Id private Integer id;
    private String nom;
    @OneToMany private ArrayList<Eleve> eleves;
}