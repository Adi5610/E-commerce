package com.ecomm.webApp.product.mappers;

import com.ecomm.webApp.product.Models.Product;
import com.ecomm.webApp.product.dto.ProductDto;
import com.ecomm.webApp.product.dto.ProductResposneDto;
import org.springframework.stereotype.Service;

@Service
public class ProductMappers {

    public Product mapProductDtoToProduct(ProductDto dto){

        Product product = new Product();
        product.setProduct_name(dto.productName());
        product.setProduct_price(dto.productPrice());

        return product;
    }

    public ProductResposneDto mapProductToProductResponseDto(Product product){

        return new ProductResposneDto(
                product.getProduct_name(),
                product.getProduct_price()
        );
    }
}
