package com.senglorn.cms.category;

import com.senglorn.cms.category.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api")
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/category")
    public String viewCategory(Model model){

        System.err.println("Data: " + categoryService.categories());

        model.addAttribute("categories", categoryService.categories());

        return "category/main";
    }
}