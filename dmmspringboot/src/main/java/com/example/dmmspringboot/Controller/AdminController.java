package com.example.dmmspringboot.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
    @RequestMapping("/")
    public String test(){
        return "/admin/QuanLiNguoiDung/UserManagement";
    }
    @RequestMapping("/ao")
    public String cc(){
        return "/admin/layout/sidebar";
    }
}
