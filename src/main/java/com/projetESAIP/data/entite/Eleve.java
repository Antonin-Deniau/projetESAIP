package com.projetESAIP.data.entite;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Eleve {
    @Id private Integer id;
    private String nom;
    private String prenom;
}
