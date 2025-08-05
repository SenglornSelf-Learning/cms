package com.senglorn.cms.category;

import com.senglorn.cms.category.service.CategoryService;
import com.senglorn.cms.model.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api")
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/category")
    public String viewCategory(Model model){
        List<Category> categories = categoryService.categories();
        model.addAttribute("categories", categories);

        return "category/main";
    }
}