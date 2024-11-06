package com.project.signin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.signin.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(String name);
}
