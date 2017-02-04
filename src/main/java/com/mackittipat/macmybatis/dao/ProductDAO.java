package com.mackittipat.macmybatis.dao;

import com.mackittipat.macmybatis.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ProductDAO {

    int insert(Product product);

    Product findById(Long id);

    Product findById2(Long id);
}
