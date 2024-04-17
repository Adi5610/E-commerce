package com.ecomm.webApp.product.service;

import com.ecomm.webApp.product.Models.Product;
import com.ecomm.webApp.product.dto.ProductDto;
import com.ecomm.webApp.product.dto.ProductResposneDto;
import com.ecomm.webApp.product.mappers.ProductMappers;
import com.ecomm.webApp.product.respository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductMappers mappers;
    private ProductRepository repository;

    public ProductService(ProductMappers mappers, ProductRepository repository) {
        this.mappers = mappers;
        this.repository = repository;
    }

    public ProductResposneDto saveProduct(ProductDto dto){

        Product product = mappers.mapProductDtoToProduct(dto);
        var savedProduct = repository.save(product);
        return mappers.mapProductToProductResponseDto(savedProduct);

    }

}
