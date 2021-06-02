package com.ressources.ressources.controller.api;

import com.ressources.ressources.entity.CategorieRessource;
import com.ressources.ressources.service.CategorieRessourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class CategorieRessourceController {
    @Autowired
    private CategorieRessourceService categorieRessourceService;
    private static final String API = "/api/categorie-ressources";

    @GetMapping(API)
    public Iterable<CategorieRessource> getCategorieRessources() {
        return categorieRessourceService.getCategorieRessources();
    }

    @GetMapping(API + "/{id}")
    public Optional<CategorieRessource> getCategorieRessource(@PathVariable int id) {
        return categorieRessourceService.getCategorieRessource(id);
    }

    @PostMapping(API)
    public CategorieRessource createCategorieRessource(@RequestParam(value = "libelle") String libelle) {
        var categorieRessource = new CategorieRessource();
        categorieRessource.setLibelle(libelle);
        return categorieRessourceService.saveCategorieRessource(categorieRessource);
    }

    @PutMapping(value = API + "/update")
    public CategorieRessource editCategorieRessource(@RequestParam(value = "libelle") String libelle, @RequestParam(value = "id")int id){
        var categorieRessource = new CategorieRessource();
        categorieRessource.setId(id);
        categorieRessource.setLibelle(libelle);
        return categorieRessourceService.saveCategorieRessource(categorieRessource);
    }

    @DeleteMapping(value = API + "/{id}")
    public void deleteCategorieRessource(@PathVariable int id) {
        categorieRessourceService.deleteCategorieRessource(id);
    }
}