package com.ressources.ressources.controller.vue;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BackOfficeController {

    @GetMapping(value = "/admin")
    public String create() {
        return "back/statistique";
    }
}
