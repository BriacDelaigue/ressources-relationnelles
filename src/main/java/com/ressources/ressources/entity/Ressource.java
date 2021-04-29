package com.ressources.ressources.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Ressource")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ressource {
    @Id
    @GeneratedValue
    private long id;

    private Date date ;
    private String texte;
    private String titre;
    private String pathFile;
    private int nbConsultation;

    @ManyToOne @JoinColumn(name = "id_utilisateur",nullable = false)
    private Utilisateur utilisateur;

    @ManyToOne @JoinColumn(name = "id_type_ressource",nullable = false)
    private TypeRessource typeRessource;

    @ManyToOne @JoinColumn(name = "id_type_relation",nullable = false)
    private TypeRelation typeRelation;

    @ManyToOne @JoinColumn(name = "id_categorie_ressource",nullable = false)
    private CategorieRessource categorieRessource;

    @ManyToOne @JoinColumn(name = "id_visibilite",nullable = false)
    private Visibilite visibilite;

    @OneToMany(targetEntity = Commentaire.class,mappedBy = "ressource")
    private List<Ressource> ressources = new ArrayList<>();

}
