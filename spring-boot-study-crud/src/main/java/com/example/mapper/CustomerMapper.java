package com.example.mapper;

import com.example.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author qianhao
 * @create 2020/5/7-20:56
 */
@Repository
public interface CustomerMapper {

    @Autowired
    private String a;
    /**
     * 保存Customer
     * @param customer
     */
    void save(Customer customer);

    /**
     * 更新Customer
     * @param customer
     */
    void update(Customer customer);

    /**
     * 删除
     * @param id
     */
    void delete(Integer id);

    /**
     * 查询Customer
     * @param id
     * @return
     */
    Customer query(Integer id);

    /**
     * 查询列表
     * @return
     */
    List<Customer> queryForList();
}
