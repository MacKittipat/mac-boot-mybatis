package com.mackittipat.macmybatis.dao;

import com.mackittipat.macmybatis.domain.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerDAO {

    @Insert("INSERT INTO customer(name, create_datetime) VALUES(#{name}, #{createDateTime})")
    int insert(Customer customer);

    @Select("SELECT * FROM customer WHERE id=#{id}")
    Customer findById(Long id);
}
