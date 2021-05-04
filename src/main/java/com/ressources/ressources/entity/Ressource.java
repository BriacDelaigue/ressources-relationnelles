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

    @JoinColumn(name = "date_publication")
    private Date datePublication ;
    private String texte;
    private String titre;
    private String pathfile;
    @JoinColumn(name = "nb_consultation")
    private int nbConsultation;

    @ManyToOne @JoinColumn(name = "utilisateur",nullable = false)
    private Utilisateur utilisateur;

    @ManyToOne @JoinColumn(name = "type_ressource",nullable = false)
    private TypeRessource typeRessource;

    @ManyToOne @JoinColumn(name = "type_relation",nullable = false)
    private TypeRelation typeRelation;

    @ManyToOne @JoinColumn(name = "categorie_ressource",nullable = false)
    private CategorieRessource categorieRessource;

    @ManyToOne @JoinColumn(name = "visibilite",nullable = false)
    private Visibilite visibilite;

    @OneToMany(targetEntity = Commentaire.class,mappedBy = "ressource")
    private List<Ressource> ressources = new ArrayList<>();

}
