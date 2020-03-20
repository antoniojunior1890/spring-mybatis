package com.antonio.example.mybatis.service.impl;

import com.antonio.example.mybatis.mapper.ProductMapper;
import com.antonio.example.mybatis.model.Product;
import com.antonio.example.mybatis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;

    @Autowired
    public ProductServiceImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public List<Product> listAll() {
        return productMapper.list();
    }

    @Override
    public void save(Product product) {
        productMapper.save(product);
    }
}
