package com.example.buysell_spring_boot_pet_project.repository;

import com.example.buysell_spring_boot_pet_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
