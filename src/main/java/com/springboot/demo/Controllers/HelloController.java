package com.springboot.demo.Controllers;

import com.springboot.demo.Entities.Category;
import com.springboot.demo.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/")
    public String startPage() {return "START";}


    @GetMapping(value = "/categories")
    public List<Category> getCategories() {
        return categoryService.getAllCategory();
    }

    @PostMapping(value = "/add")
    public void addCategory(@RequestBody Category category) {
        categoryService.insert(category);
    }
}
