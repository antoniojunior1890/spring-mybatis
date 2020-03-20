package com.antonio.example.mybatis.controller;

import com.antonio.example.mybatis.model.Product;
import com.antonio.example.mybatis.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    private final ProductServiceImpl productServiceImpl;

    @Autowired
    public ProductController(ProductServiceImpl productServiceImpl) {
        this.productServiceImpl = productServiceImpl;
    }

    @GetMapping
    public ResponseEntity<List<Product>> listAll() {
        return ResponseEntity.ok(productServiceImpl.listAll());
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Product product){
        productServiceImpl.save(product);
        return ResponseEntity.ok().build();
    }


//    @PostMapping
//    public ResponseEntity<Product> create(@RequestBody @Valid Product product){
//
//        Product createdProduct = productServiceImpl.save(product);
//        return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
//    }

}

