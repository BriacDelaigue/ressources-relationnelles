package com.ressources.ressources.repository;

import com.ressources.ressources.entity.TypeRessource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRessourceRepository extends CrudRepository<TypeRessource,Long> {
}
