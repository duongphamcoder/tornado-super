package com.example.jollibee.jollibee.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cartProduct")
public class CartProduct {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameProduct;
    private String priceProduct;
    private String quantityProduct;
    private String sumProduct;
    private float sumProductOfFloat;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public CartProduct() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(String priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(String quantityProduct) {
        this.quantityProduct = quantityProduct;
    }
    


    public String getSumProduct() {
        return sumProduct;
    }

    public void setSumProduct(String sumProduct) {
        this.sumProduct = sumProduct;
    }

    

    public float getSumProductOfFloat() {
        return sumProductOfFloat;
    }

    public void setSumProductOfFloat(float sumProductOfFloat) {
        this.sumProductOfFloat = sumProductOfFloat;
    }

    @Override
    public String toString() {
        return "CartProduct [id=" + id + ", nameProduct=" + nameProduct + ", priceProduct=" + priceProduct
                + ", quantityProduct=" + quantityProduct + ", sumProduct=" + sumProduct + ", sumProductOfFloat="
                + sumProductOfFloat + ", user=" + user + "]";
    }
}
