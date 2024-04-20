package com.ecomm.webApp.productOrder.models;

import com.ecomm.webApp.customer.Models.Customer;
import com.ecomm.webApp.product.Models.Product;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document( collection = "ProductOrder")
public class ProductOrder {


    private Product[] products;
    private Customer customer;

    public ProductOrder() {
    }

    public ProductOrder(Product[] products, Customer customer) {

        this.products = products;
        this.customer = customer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
