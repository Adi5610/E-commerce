package com.ecomm.webApp.customer.service;

import com.ecomm.webApp.customer.Models.Customer;
import com.ecomm.webApp.customer.dto.CustomerDto;
import com.ecomm.webApp.customer.mappers.CustomerMapper;
import com.ecomm.webApp.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private CustomerMapper mapper;

    private CustomerRepository repository;

    public CustomerService(CustomerMapper mapper, CustomerRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public Customer saveCustomer(CustomerDto dto){

        Customer customer = mapper.mapCustomerDtoToCustomer(dto);
        return repository.save(customer);
    }
}
