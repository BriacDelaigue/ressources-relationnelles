package com.ressources.ressources.controller.api;

import com.ressources.ressources.entity.Role;
import com.ressources.ressources.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class RoleController {
    @Autowired
    private RoleService roleService;
    private static final String API = "api/role";

    @GetMapping(API)
    public Iterable<Role> getRoles(){
        return roleService.getRoles();
    }

    @GetMapping(API + "/{id}")
    public Optional<Role> getRole(@PathVariable int id){
        return roleService.getRole(id);
    }

    @PostMapping(API)
    public Role createRole(@RequestParam(value = "libelle") String libelle){
        var role = new Role();
        role.setLibelle(libelle);
        return roleService.saveRole(role);
    }

    @PutMapping(value = API + "/update")
    public Role editRole(@RequestParam(value = "libelle") String libelle, @RequestParam(value = "id") int id){
        var role = new Role();
        role.setId(id);
        role.setLibelle(libelle);
        return roleService.saveRole(role);
    }

    @DeleteMapping(value = API + "/{id}")
    public void deleteRole(@PathVariable(value = "id") int id){
        roleService.deleteRole(id);
    }
}
