package com.example.jollibee.jollibee.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.example.jollibee.jollibee.model.CartProduct;
import com.example.jollibee.jollibee.model.User;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartCrud  extends CrudRepository<CartProduct, Long> {
    List<CartProduct> findByUser(User user);
    CartProduct findByNameProduct(String name);

    @Transactional
    @Modifying
    @Query("update CartProduct c set c.quantityProduct = ?1, c.sumProduct = ?2, c.sumProductOfFloat = ?3 where c.id = ?4")
    void updateProduct(String quantity, String sumProduct, float sumOfFloat,Long id);
}
