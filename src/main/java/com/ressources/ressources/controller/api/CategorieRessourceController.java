package com.ressources.ressources.controller.api;

import com.ressources.ressources.entity.CategorieRessource;
import com.ressources.ressources.service.CategorieRessourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CategorieRessourceController {
    private CategorieRessourceService categorieRessourceService;

    @GetMapping("/api/categorieRessources")
    public Iterable<CategorieRessource> getCategoriesRessources(){
        System.out.println(categorieRessourceService);
        return categorieRessourceService.getCategorieRessources();
    }
}
