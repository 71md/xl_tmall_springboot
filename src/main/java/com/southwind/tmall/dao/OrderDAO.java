package com.southwind.tmall.dao;

import com.southwind.tmall.pojo.Order;
import com.southwind.tmall.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDAO extends JpaRepository<Order,Integer> {
    public List<Order> findByUserAndStatusNotOrderByIdDesc(User user, String status);
}
