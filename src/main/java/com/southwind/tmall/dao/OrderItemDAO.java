package com.southwind.tmall.dao;

import com.southwind.tmall.pojo.Order;
import com.southwind.tmall.pojo.OrderItem;
import com.southwind.tmall.pojo.Product;
import com.southwind.tmall.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer> {
    List<OrderItem> findByOrderOrderByIdDesc(Order order);

    List<OrderItem> findByProduct(Product product);
    List<OrderItem> findByUserAndOrderIsNull(User user);
}
