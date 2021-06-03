package com.ressources.ressources.controller.vue;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class UtilisateurController {

    @GetMapping(value = "/connexion")
    public String login() {
        return "utilisateur/connexion";
    }

    @GetMapping(value = "/inscription")
    public String sign() {
        return "utilisateur/inscription";
    }

    @GetMapping(value = "/profil")
    public String profil() {
        return "utilisateur/profil";
    }

}
