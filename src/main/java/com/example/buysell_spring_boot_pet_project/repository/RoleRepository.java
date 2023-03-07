package com.example.buysell_spring_boot_pet_project.repository;

import com.example.buysell_spring_boot_pet_project.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
