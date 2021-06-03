package com.ressources.ressources.repository;

import com.ressources.ressources.entity.Ressource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RessourceRepository extends CrudRepository<Ressource,Long>{
}
