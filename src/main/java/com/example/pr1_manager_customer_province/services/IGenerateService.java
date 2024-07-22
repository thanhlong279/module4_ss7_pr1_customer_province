package com.example.pr1_manager_customer_province.services;

import com.example.pr1_manager_customer_province.models.Province;

import java.util.Optional;

public interface IGenerateService<T>{

    Iterable<T> findAll();

    void save(T t);

    Optional<T> findById(Long id);

    void remove(Long id);
}
