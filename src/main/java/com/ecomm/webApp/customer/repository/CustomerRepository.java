package com.ecomm.webApp.customer.repository;

import com.ecomm.webApp.customer.Models.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, Integer> {
}
