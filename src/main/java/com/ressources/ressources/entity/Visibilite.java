package com.ressources.ressources.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Visibilite")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Visibilite {
    @Id
    @GeneratedValue
    private int id;

    private String libelle;

    @OneToMany( targetEntity = Ressource.class, mappedBy = "visibilite")
    private List<Ressource> ressources = new ArrayList<>();

}
