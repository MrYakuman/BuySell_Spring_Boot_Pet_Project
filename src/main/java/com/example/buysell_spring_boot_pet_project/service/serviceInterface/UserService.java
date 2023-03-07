package com.example.buysell_spring_boot_pet_project.service.serviceInterface;

import com.example.buysell_spring_boot_pet_project.entity.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();

    public void save(User user);
}
