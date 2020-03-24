package com.antonio.example.mybatis.mapper;

import com.antonio.example.mybatis.model.Category;
import com.antonio.example.mybatis.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CategoryMapper {

    List<Category> list();

}
