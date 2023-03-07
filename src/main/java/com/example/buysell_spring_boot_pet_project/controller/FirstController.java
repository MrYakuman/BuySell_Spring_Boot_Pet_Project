package com.example.buysell_spring_boot_pet_project.controller;

import com.example.buysell_spring_boot_pet_project.entity.User;
import com.example.buysell_spring_boot_pet_project.service.serviceInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FirstController {
    private UserService userService;

    @Autowired
    public FirstController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String helloWords() {
        return "hello";
    }

    @RequestMapping("/all")
    public List<User> showAll() {
        return userService.findAll();
    }
}
