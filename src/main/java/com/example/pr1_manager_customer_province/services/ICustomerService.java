package com.example.pr1_manager_customer_province.services;

import com.example.pr1_manager_customer_province.models.Customer;
import com.example.pr1_manager_customer_province.models.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService extends IGenerateService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByFirstNameContaining(Pageable pageable, String s);
}
