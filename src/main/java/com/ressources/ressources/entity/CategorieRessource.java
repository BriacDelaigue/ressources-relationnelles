package com.ressources.ressources.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CategorieRessource")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CategorieRessource {
    @Id
    @GeneratedValue
    private long id;

    private String libelle;

    @OneToMany( targetEntity = Ressource.class, mappedBy = "categorie_ressource")
    private List<Ressource> ressources = new ArrayList<>();

}
