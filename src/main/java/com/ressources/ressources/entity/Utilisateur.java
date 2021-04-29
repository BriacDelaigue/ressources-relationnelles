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
    @JoinTable(name = "Relation", joinColumns = @JoinColumn(name = "id_utilisateur"), inverseJoinColumns = @JoinColumn(name = "id_relation"))
    private List<TypeRelation> typeRelations = new ArrayList<>();

    @OneToMany(targetEntity = Ressource.class, mappedBy = "utilisateur")
    private List<Ressource> ressources = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "Favoris", joinColumns = @JoinColumn(name = "id_utilisateur"),inverseJoinColumns = @JoinColumn(name = "id_ressource"))
    private List<Ressource> ressourceFavoris = new ArrayList<>();

    @ManyToOne @JoinColumn(name = "id_role", nullable = false)
    private Role role;

    @OneToMany(targetEntity = Commentaire.class, mappedBy = "commentaire")
    private List<Commentaire> commentaires = new ArrayList<>();
}
