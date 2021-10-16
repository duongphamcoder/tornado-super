package com.example.jollibee.jollibee.service;

import java.lang.annotation.Annotation;
import java.security.Principal;

import com.example.jollibee.jollibee.dao.CartCrud;
import com.example.jollibee.jollibee.dao.UserCrud;
import com.example.jollibee.jollibee.model.CartProduct;
import com.example.jollibee.jollibee.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ServiceClassImpl implements ServiceClass {

    @Autowired
    UserCrud userCrud;

    @Autowired
    CartCrud cartCrud;

    @Override
    public boolean saveUser(User user) {
        if (userCrud.findByUsername(user.getUsername()) == null) {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            user.setPassword(encoder.encode(user.getPassword()));
            user.setRole("ROLE_USER");
            userCrud.save(user);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkLogin(Principal principal) {
        if (principal == null) {
            return false;
        }
        return true;
    }

    // xử lý tính toán tiền
    @Override
    public String calculate(String begin) {
        String remainder = begin.substring(begin.length() - 2) + "00";
        String integerOfSum = begin.substring(0, begin.length() - 2);
        String temp = "";
        int count = 0;
        for (int i = integerOfSum.length() - 3; i > 0; i -= 3) {
            temp = "." + integerOfSum.substring(i, i + 3) + temp;
            count++;
        }
        return integerOfSum.substring(0, integerOfSum.length() - (temp.length() - count)) + temp + remainder;
    }

    @Override
    public void addProductToCart(String name, String price, String quantity, String username) {
        User user = userCrud.findByUsername(username);
        CartProduct cart = new CartProduct();
        cart.setUser(user);
        cart.setNameProduct(name);
        cart.setPriceProduct(price);
        cart.setQuantityProduct(quantity);
        cart.setSumProductOfFloat(Float.parseFloat(price.trim()) * Integer.parseInt(quantity.trim()));
        String sumProduct = cart.getSumProductOfFloat() + "";
        cart.setSumProduct(calculate(sumProduct));
        if (cartCrud.findByNameProduct(name) != null) {
            float newSumProductOfFloat = cartCrud.findByNameProduct(name).getSumProductOfFloat()
                    + cart.getSumProductOfFloat();
            String newQuantity = (Integer.parseInt(cartCrud.findByNameProduct(name).getQuantityProduct())
                    + Integer.parseInt(cart.getQuantityProduct())) + "";
            System.out.println(calculate(newSumProductOfFloat + "") + "\n" + newQuantity);
            cartCrud.updateProduct(newQuantity, calculate(newSumProductOfFloat + ""), newSumProductOfFloat,  cartCrud.findByNameProduct(name).getId());
        } else {
            cartCrud.save(cart);
        }
    }

    @Override
    public int quantityProductOfCart(String username) {
        if(username == null) {
            return 0;
        }
        User user = userCrud.findByUsername(username);
        return cartCrud.findByUser(user).size();
    }
}
