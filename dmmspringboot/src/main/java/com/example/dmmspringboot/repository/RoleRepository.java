package com.example.dmmspringboot.repository;

import com.example.dmmspringboot.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
