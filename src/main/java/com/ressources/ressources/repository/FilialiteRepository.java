package com.ressources.ressources.repository;

import com.ressources.ressources.entity.Filialite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilialiteRepository extends CrudRepository<Filialite,Long> {
}
