package com.example.dmmspringboot.Controller.admin;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import com.example.dmmspringboot.repository.UserRepository;
import com.example.dmmspringboot.service.UploadService;
import com.example.dmmspringboot.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.dmmspringboot.domain.User;

import jakarta.servlet.ServletContext;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UserController {
    private PasswordEncoder passwordEncoder;
    private final UploadService uploadService;
    private final UserService userService;
    public UserController(UploadService uploadService, PasswordEncoder passwordEncoder,UserService userService) {
        this.uploadService = uploadService;
        this.passwordEncoder = passwordEncoder;
        this.userService = userService;
    }

    @GetMapping("/admin/user")
    public String user(Model model){
        List<User> listUser = this.userService.getUser();
        model.addAttribute("listUser",listUser);
        return "/admin/user/show";
    }
    @GetMapping("/admin/user/create")
    public String CreateUser(Model model){
         model.addAttribute("createdUser", new User());
        return "/admin/user/create";
    }

    @PostMapping("/admin/user/created")
    public String CreatedUser(@ModelAttribute("createdUser") User user, @RequestParam("tuanneFile") MultipartFile file){
        System.out.println("============================================================================================================"+user);
        String avartar = this.uploadService.handleSaveUploadFile(file,"avatar");
        String hashPassword = this.passwordEncoder.encode(user.getPassword());

        user.setRole(this.userService.getRolebyName(user.getRole().getName()));
        user.setAvatar(avartar);
        user.setPassword(hashPassword);
        this.userService.Saveuser(user);
        return "/admin/user/show";
    }

}
