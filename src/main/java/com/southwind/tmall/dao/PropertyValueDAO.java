package com.southwind.tmall.dao;

import com.southwind.tmall.pojo.Product;
import com.southwind.tmall.pojo.Property;
import com.southwind.tmall.pojo.PropertyValue;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface PropertyValueDAO extends JpaRepository<PropertyValue, Integer> {
    List<PropertyValue> findByProductOrderByIdDesc(Product product);
    PropertyValue getByPropertyAndProduct(Property property,Product product);


}
