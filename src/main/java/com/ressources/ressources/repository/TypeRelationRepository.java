package com.ressources.ressources.repository;

import com.ressources.ressources.entity.TypeRelation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRelationRepository extends CrudRepository<TypeRelation,Long> {
}
