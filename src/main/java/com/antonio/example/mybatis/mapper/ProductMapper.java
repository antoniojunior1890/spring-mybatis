package com.antonio.example.mybatis.mapper;

import com.antonio.example.mybatis.model.Product;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductMapper {

//  @Select("SELECT * FROM PRODUCT")
  List<Product> list();
//
//  @Options(useGeneratedKeys = true)
//  @Insert("INSERT INTO PRODUCT (name, description, price ) VALUES (#{name}, #{description}, #{price})")
//  void save(Product product);
  void save(@Param("product") Product product);
}