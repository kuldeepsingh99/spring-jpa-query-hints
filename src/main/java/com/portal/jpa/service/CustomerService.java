package com.portal.jpa.service;

import com.portal.jpa.model.Customer;
import com.portal.jpa.repository.CustomerRepository;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findCustomerWithSalaryGreaterThan(Double salary) {
        return customerRepository.findCustomerWithSalaryGreaterThan(salary);
    }

}
