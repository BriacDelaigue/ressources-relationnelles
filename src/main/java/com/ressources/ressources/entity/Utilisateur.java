package com.ressources.ressources.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Utilisateur")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Utilisateur {
    @Id
    @GeneratedValue
    private long id;

    private String nom;
    private String prenom;
    private String mail;
    private String mdp;
    private Boolean verifier;

    @ManyToMany
    @JoinTable(name = "Relation", joinColumns = @JoinColumn(name = "utilisateur"), inverseJoinColumns = @JoinColumn(name = "Filialite"))
    private  List<Utilisateur> relations = new ArrayList<>();

    @OneToMany(targetEntity = Ressource.class, mappedBy = "utilisateur")
    private List<Ressource> ressources = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "Favoris", joinColumns = @JoinColumn(name = "utilisateur"),inverseJoinColumns = @JoinColumn(name = "ressource"))
    private List<Ressource> ressourceFavoris = new ArrayList<>();

    @ManyToOne @JoinColumn(name = "role", nullable = false)
    private Role role;

    @OneToMany(targetEntity = Commentaire.class, mappedBy = "utilisateur")
    private List<Commentaire> commentaires = new ArrayList<>();
}
