package com.antonio.example.mybatis.service;

import com.antonio.example.mybatis.model.Category;
import com.antonio.example.mybatis.model.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryService {

    List<Category> listAll();

    void save(@Param("category") Category category);
}
