package com.ressources.ressources.service;

import com.ressources.ressources.entity.CategorieRessource;
import com.ressources.ressources.repository.CategorieRessourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategorieRessourceService {
    @Autowired
    private CategorieRessourceRepository categorieRessourceRepository;


    public Iterable<CategorieRessource> getCategorieRessources() {
        return categorieRessourceRepository.findAll();
    }
}
