package com.antonio.example.mybatis.service.impl;

import com.antonio.example.mybatis.mapper.CategoryMapper;
import com.antonio.example.mybatis.model.Category;
import com.antonio.example.mybatis.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryMapper categoryMapper;

    @Autowired
    public CategoryServiceImpl(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @Override
    public List<Category> listAll() {
        return categoryMapper.list();
    }

    @Override
    public void save(Category category) {
        categoryMapper.save(category);
    }

}
