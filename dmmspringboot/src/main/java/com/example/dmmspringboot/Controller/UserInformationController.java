package com.example.dmmspringboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserInformationController {
    @RequestMapping("/UserInformation")
    public String UserInformation(){
        return "/admin/ThongTinNguoiDung/UserInformation";
    }
}
