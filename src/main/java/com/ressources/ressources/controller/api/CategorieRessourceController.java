package com.ressources.ressources.controller.api;

import com.ressources.ressources.entity.CategorieRessource;
import com.ressources.ressources.service.CategorieRessourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CategorieRessourceController {
    @Autowired
    private CategorieRessourceService categorieRessourceService;

    @GetMapping("/api/categorieRessources")
    public Iterable<CategorieRessource> getCategoriesRessources(){
        return categorieRessourceService.getCategorieRessources();
    }
}
