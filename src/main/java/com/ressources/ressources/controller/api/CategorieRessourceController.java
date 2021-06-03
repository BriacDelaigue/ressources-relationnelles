package com.ressources.ressources.controller.api;

import com.ressources.ressources.entity.CategorieRessource;
import com.ressources.ressources.service.CategorieRessourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class CategorieRessourceController {
    @Autowired
    private CategorieRessourceService categorieRessourceService;
    private final String API = "/api/categorie-ressources";

    @GetMapping(API)
    public Iterable<CategorieRessource> getCategorieRessources() {
        return categorieRessourceService.getCategorieRessources();
    }

    @GetMapping(API + "/{id}")
    public Optional<CategorieRessource> getCategorieRessource(@PathVariable int id) {
        return categorieRessourceService.getCategorieRessource(id);
    }
}
