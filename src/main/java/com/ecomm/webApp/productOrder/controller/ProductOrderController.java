package com.ecomm.webApp.productOrder.controller;

import com.ecomm.webApp.productOrder.models.ProductOrder;
import com.ecomm.webApp.productOrder.service.ProductOrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductOrderController {

    private ProductOrderService service;

    public ProductOrderController(ProductOrderService service) {
        this.service = service;
    }

    @PostMapping("/productOrders")
    public ProductOrder CreateProductOrder(
            @RequestBody ProductOrder productOrder){

        return service.SaveProductOrder(productOrder);

    }
}
