package com.ecomm.webApp.product.controller;

import com.ecomm.webApp.product.dto.ProductDto;
import com.ecomm.webApp.product.dto.ProductResposneDto;
import com.ecomm.webApp.product.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping("/products")
    public ProductResposneDto createProduct(
            @RequestBody ProductDto dto){
        return service.saveProduct(dto);
    }
}
