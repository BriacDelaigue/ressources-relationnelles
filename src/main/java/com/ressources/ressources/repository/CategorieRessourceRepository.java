package com.ressources.ressources.repository;

import com.ressources.ressources.entity.CategorieRessource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRessourceRepository extends CrudRepository<CategorieRessource,Long> {
}
