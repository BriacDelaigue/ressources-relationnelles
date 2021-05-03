package com.ressources.ressources.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class IndexController {

    //Page Index
    @GetMapping(value = {"/", "/index", "/home"})
    public String index() {
        return "list-ressource";
    }

    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

    @GetMapping(value = "/signup")
    public String sign() {
        return "sign";
    }

    @GetMapping(value = "/create")
    public String create() {
        return "create-ressource";
    }

    @GetMapping(value = "/user")
    public String profil() {
        return "user-profil";
    }

    @GetMapping(value = "/read")
    public String read() {
        return "read-ressource";
    }
}