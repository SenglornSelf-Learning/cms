package com.senglorn.cms.category.service;

import com.senglorn.cms.category.CategoryRepository;
import com.senglorn.cms.model.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImp implements CategoryService{

    private final CategoryRepository categoryRepository;
    @Override
    public List<Category> categories() {
           return categoryRepository.selectAllCategorise();
    }
}
