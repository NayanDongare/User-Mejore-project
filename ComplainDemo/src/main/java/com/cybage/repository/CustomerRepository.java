package com.cybage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cybage.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
