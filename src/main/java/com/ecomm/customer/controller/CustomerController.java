package com.ecomm.customer.controller;

import com.ecomm.customer.Models.Customer;
import com.ecomm.customer.dto.CustomerDto;
import com.ecomm.customer.mappers.CustomerMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private CustomerMapper mapper;

    public CustomerController(CustomerMapper mapper) {
        this.mapper = mapper;
    }

    @PostMapping("/customer")
    public Customer createCustomer(
            @RequestBody CustomerDto dto){


        return mapper.mapCustomerDtoToCustomer(dto);

    }
}
