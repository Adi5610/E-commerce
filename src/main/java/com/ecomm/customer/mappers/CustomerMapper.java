package com.ecomm.customer.mappers;

import com.ecomm.customer.Models.Customer;
import com.ecomm.customer.dto.CustomerDto;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {

        public Customer mapCustomerDtoToCustomer(CustomerDto dto){

                Customer customer = new Customer();
                customer.setCustomer_firstName(dto.firstName());
                customer.setCustomer_lastName(dto.lastName());
                customer.setCustomer_address(dto.address());
                customer.setCustomer_email(dto.email());

                return customer;
        }


}
