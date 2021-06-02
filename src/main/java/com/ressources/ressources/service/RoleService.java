package com.ressources.ressources.service;

import com.ressources.ressources.entity.Role;
import com.ressources.ressources.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public Iterable<Role> getRoles(){
        return roleRepository.findAll();
    }

    public Optional<Role> getRole(int id){
        return roleRepository.findById(id);
    }

    public Role saveRole(Role role){
        return roleRepository.save(role);
    }

    public void deleteRole(int id){
        roleRepository.deleteById(id);
    }

}
