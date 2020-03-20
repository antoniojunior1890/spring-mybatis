package com.antonio.example.mybatis.service;

import com.antonio.example.mybatis.model.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    void save(@Param("product") Product product);
}
