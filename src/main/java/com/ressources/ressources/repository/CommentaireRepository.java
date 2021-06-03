package com.ressources.ressources.repository;

import com.ressources.ressources.entity.Commentaire;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentaireRepository extends CrudRepository<Commentaire, Long> {
}
