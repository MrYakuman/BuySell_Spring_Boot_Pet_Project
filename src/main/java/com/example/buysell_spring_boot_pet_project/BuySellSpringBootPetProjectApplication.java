package com.example.buysell_spring_boot_pet_project;

import com.example.buysell_spring_boot_pet_project.service.serviceImpl.UserServiceImpl;
import com.example.buysell_spring_boot_pet_project.service.serviceInterface.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuySellSpringBootPetProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuySellSpringBootPetProjectApplication.class, args);
    }

}
