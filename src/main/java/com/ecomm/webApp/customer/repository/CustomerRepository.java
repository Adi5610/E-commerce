package com.ecomm.webApp.customer.repository;

import com.ecomm.webApp.customer.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
