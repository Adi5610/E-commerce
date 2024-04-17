package com.ecomm.webApp.product.respository;

import com.ecomm.webApp.product.Models.Product;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,Integer> {
}
