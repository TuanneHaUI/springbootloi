package com.example.dmmspringboot.repository;

import com.example.dmmspringboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    User save(User tuanne);
    
}
