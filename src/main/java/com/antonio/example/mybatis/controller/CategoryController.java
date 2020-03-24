package com.antonio.example.mybatis.controller;

import com.antonio.example.mybatis.model.Category;
import com.antonio.example.mybatis.model.Product;
import com.antonio.example.mybatis.service.CategoryService;
import com.antonio.example.mybatis.service.impl.CategoryServiceImpl;
import com.antonio.example.mybatis.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {

    private final CategoryServiceImpl categoryServiceImpl;
    @Autowired
    public CategoryController(CategoryServiceImpl categoryServiceImpl) {
        this.categoryServiceImpl = categoryServiceImpl;
    }

    @GetMapping
    public ResponseEntity<List<Category>> listAll() {
        return ResponseEntity.ok(categoryServiceImpl.listAll());
    }

}

