package com.antonio.example.mybatis.mapper;

import com.antonio.example.mybatis.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductMapper {

  @Select("SELECT * FROM PRODUCT")
  List<Product> findAll();

  void save(@Param("product") Product product);
}