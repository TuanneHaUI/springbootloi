package com.example.dmmspringboot.service;

import com.example.dmmspringboot.domain.Role;
import com.example.dmmspringboot.domain.User;
import com.example.dmmspringboot.repository.RoleRepository;
import com.example.dmmspringboot.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    public UserService(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }
    public List<User> getAllUsers(){
        return this.userRepository.findAll();
    }
    public void Saveuser(User user){
         this.userRepository.save(user);
    }
    public Role getRolebyName(String name){
        return this.roleRepository.findByName(name);
    }
    public List<User> getUser(){
        return this.userRepository.findAll();
    }
}
