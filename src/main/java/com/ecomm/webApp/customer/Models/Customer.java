package com.ecomm.webApp.customer.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Customer")
public class Customer {

    private String customer_firstName;
    private String customer_lastName;

    private String customer_address;
    private String customer_email;

    public Customer() {
    }

    public Customer(String customer_firstName, String customer_lastName, String customer_address, String customer_email) {
        this.customer_firstName = customer_firstName;
        this.customer_lastName = customer_lastName;
        this.customer_address = customer_address;
        this.customer_email = customer_email;
    }
/*
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   */

    public String getCustomer_firstName() {
        return customer_firstName;
    }

    public void setCustomer_firstName(String customer_firstName) {
        this.customer_firstName = customer_firstName;
    }

    public String getCustomer_lastName() {
        return customer_lastName;
    }

    public void setCustomer_lastName(String customer_lastName) {
        this.customer_lastName = customer_lastName;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }
}
