package com.ecomm.webApp.customer.controller;

import com.ecomm.webApp.customer.Models.Customer;
import com.ecomm.webApp.customer.dto.CustomerDto;
import com.ecomm.webApp.customer.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @PostMapping("/customers")
    public Customer createCustomer(
            @RequestBody CustomerDto dto){

        return service.saveCustomer(dto);
    }
}
