package com.ecomm.customer.dto;

public record CustomerDto(
        String firstName,
        String lastName,
        String address,
        String email
) {
}
