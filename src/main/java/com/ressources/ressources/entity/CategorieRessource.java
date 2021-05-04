package com.ressources.ressources.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categorie_ressource")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CategorieRessource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String libelle;

    @OneToMany( targetEntity = Ressource.class, mappedBy = "categorie_ressource")
    private List<Ressource> ressources = new ArrayList<>();

}
