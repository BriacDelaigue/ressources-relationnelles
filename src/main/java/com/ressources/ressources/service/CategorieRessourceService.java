package com.ressources.ressources.service;

import com.ressources.ressources.entity.CategorieRessource;
import com.ressources.ressources.repository.CategorieRessourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategorieRessourceService {
    @Autowired
    private CategorieRessourceRepository categorieRessourceRepository;


    public Iterable<CategorieRessource> getCategorieRessources() {
        return categorieRessourceRepository.findAll();
    }

    public Optional<CategorieRessource> getCategorieRessource(int id) {
        return categorieRessourceRepository.findById(id);
    }

    public void deleteCategorieRessource(int id) {
        categorieRessourceRepository.deleteById(id);
    }

    public CategorieRessource saveCategorieRessource(CategorieRessource categorieRessource) {
        return categorieRessourceRepository.save(categorieRessource);
    }
}
