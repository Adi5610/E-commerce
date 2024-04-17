package com.ecomm.webApp.product.Models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Product")
public class Product {



    private String product_name;
    private float product_price;


    public Product() {
    }

    public Product(String product_name, float product_price) {
        this.product_name = product_name;
        this.product_price = product_price;
    }
/*
    public Integer getProduct_id() {
        return product_id;
    }*/

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public float getProduct_price() {
        return product_price;
    }

    public void setProduct_price(float product_price) {
        this.product_price = product_price;
    }
}
