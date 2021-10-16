package com.example.jollibee.jollibee.dao;

import java.util.List;

import com.example.jollibee.jollibee.model.Product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCrud  extends CrudRepository<Product,Long>{
        List<Product> findByClassify(String classify);
        Product findByName(String name);
}
