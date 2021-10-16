package com.example.jollibee.jollibee.service;

import java.security.Principal;

import com.example.jollibee.jollibee.model.User;

import org.springframework.stereotype.Service;

@Service
public interface ServiceClass {
    boolean saveUser(User user);
    boolean checkLogin(Principal principal);
    void addProductToCart(String name, String price, String quantity,  String username); 
    String calculate(String begin);
    int quantityProductOfCart(String username) ;
}
