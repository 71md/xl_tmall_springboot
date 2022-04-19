package com.southwind.tmall.dao;

import com.southwind.tmall.pojo.Category;
import com.southwind.tmall.pojo.Property;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropertyDAO extends JpaRepository<Property,Integer> {
    Page<Property> findByCategory(Category category, Pageable pageable);
    //List<Property> findByCategory(Category category);
    List<Property> findByCategory(Category category);
}
