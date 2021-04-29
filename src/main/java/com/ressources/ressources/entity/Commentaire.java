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
    private String date;
    private Date cheminImage;

    @ManyToOne @JoinColumn(name = "id_utilisateur",nullable = false)
    private Utilisateur utilisateur;

    @ManyToOne @JoinColumn(name= "id_ressource",nullable = false)
    private Ressource ressource;
}
