package com.ressources.ressources.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Type_Ressource")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TypeRessource {
    @Id
    @GeneratedValue
    private long id;

    private String libelle;

    @OneToMany( targetEntity = Ressource.class, mappedBy = "typeRessource")
    private List<Ressource> ressources = new ArrayList<>();

}
