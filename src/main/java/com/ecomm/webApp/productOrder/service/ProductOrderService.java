package com.ecomm.webApp.productOrder.service;


import com.ecomm.webApp.product.respository.ProductRepository;
import com.ecomm.webApp.productOrder.models.ProductOrder;
import com.ecomm.webApp.productOrder.repository.ProductOrderRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductOrderService{

    private ProductOrderRepository repository;

    public ProductOrderService(ProductOrderRepository repository) {
        this.repository = repository;
    }

    public ProductOrder SaveProductOrder(ProductOrder productOrder){

        ProductOrder productOrder1 = repository.save(productOrder);
        return productOrder1;


    }

}
