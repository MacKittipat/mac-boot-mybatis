package com.mackittipat.macmybatis.dao;

import com.mackittipat.macmybatis.domain.OrderProduct;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OrderProductDAO {

    int insert(OrderProduct orderProduct);

    OrderProduct findById(Long id);

    OrderProduct findById2(Long id);
}
