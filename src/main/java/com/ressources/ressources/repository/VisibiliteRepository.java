package com.ressources.ressources.repository;

import com.ressources.ressources.entity.Visibilite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisibiliteRepository extends CrudRepository<Visibilite,Long> {
}
