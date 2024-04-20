package com.ecomm.webApp.productOrder.repository;

import com.ecomm.webApp.productOrder.models.ProductOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductOrderRepository extends MongoRepository<ProductOrder, Integer> {
}
