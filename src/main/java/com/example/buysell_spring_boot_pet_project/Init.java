package com.example.buysell_spring_boot_pet_project;

import com.example.buysell_spring_boot_pet_project.entity.Role;
import com.example.buysell_spring_boot_pet_project.entity.User;
import com.example.buysell_spring_boot_pet_project.service.serviceInterface.RoleService;
import com.example.buysell_spring_boot_pet_project.service.serviceInterface.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import java.util.Set;


@Component
public class Init {
    private final UserService userService;
    private final RoleService roleService;

    @Autowired
    public Init(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    @Transactional
    public void initGo() {
        Role role = new Role("ADMIN");
        Role role2 = new Role("USER");

        roleService.save(role);
        roleService.save(role2);

        User user = new User(
                "Ivan",
                "Petrov",
                "petrov@go.com",
                "100",
                Set.of(role, role2));

        userService.save(user);
    }
}
