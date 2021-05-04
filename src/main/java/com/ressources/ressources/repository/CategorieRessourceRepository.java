package com.ressources.ressources.repository;

import com.ressources.ressources.entity.CategorieRessource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategorieRessourceRepository extends JpaRepository<CategorieRessource,Integer> {
}
