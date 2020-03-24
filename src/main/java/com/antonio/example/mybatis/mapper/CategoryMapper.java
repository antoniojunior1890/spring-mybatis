package com.antonio.example.mybatis.mapper;

import com.antonio.example.mybatis.model.Category;
import com.antonio.example.mybatis.model.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CategoryMapper {

    List<Category> list();

    @Insert("INSERT INTO CATEGORY (name, description) VALUES (#{name}, #{description})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void save(Category category);

}
