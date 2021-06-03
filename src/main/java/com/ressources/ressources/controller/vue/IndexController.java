package com.ressources.ressources.controller.vue;

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

    @GetMapping(value = "/create")
    public String create() {
        return "create-ressource";
    }

    @GetMapping(value = "/read")
    public String read() {
        return "read-ressource";
    }
}