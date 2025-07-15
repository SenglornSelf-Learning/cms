package com.senglorn.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class DashboardController {
    @GetMapping("/dashboard")
    public String dashboard(){
        return "fragments/layout/adminLayout";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "admin/main";
    }
}
