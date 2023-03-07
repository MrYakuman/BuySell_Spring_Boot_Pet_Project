package com.example.buysell_spring_boot_pet_project.service.serviceImpl;

import com.example.buysell_spring_boot_pet_project.entity.Role;
import com.example.buysell_spring_boot_pet_project.repository.RoleRepository;
import com.example.buysell_spring_boot_pet_project.service.serviceInterface.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    @Override
    public void save(Role role) {
        roleRepository.save(role);
    }

    @Override
    public Role findRoleByRole(String userRole) {
        return null;
    }
}
