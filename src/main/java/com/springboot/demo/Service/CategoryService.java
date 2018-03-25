package com.springboot.demo.Service;

import com.springboot.demo.Entities.Category;
import com.springboot.demo.Repositories.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;

    public List<Category> getAllCategory() {
        return categoryRepo.findAll();
    }

    public void insert(Category category) {
        categoryRepo.save(category);
    }


}
