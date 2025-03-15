package com.example.dmmspringboot.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DarshboardController {

    @GetMapping("/admin")
    public String getDashBoard(){
        return "admin/dashboard/show";
    }
}
