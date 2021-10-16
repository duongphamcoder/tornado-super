package com.example.jollibee.jollibee.dao;


import com.example.jollibee.jollibee.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCrud extends CrudRepository<User,Long> {
    User findByUsername(String username);
}
