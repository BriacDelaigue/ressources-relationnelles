package com.ressources.ressources.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Commentaire")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Commentaire {
    @Id
    @GeneratedValue
    private long id;

    private String texte;
    @JoinColumn(name = "date_poste")
    private Date datePoste;
    @JoinColumn(name = "chemin_image")
    private String cheminImage;

    @ManyToOne @JoinColumn(name = "utilisateur",nullable = false)
    private Utilisateur utilisateur;

    @ManyToOne @JoinColumn(name= "ressource",nullable = false)
    private Ressource ressource;
}
