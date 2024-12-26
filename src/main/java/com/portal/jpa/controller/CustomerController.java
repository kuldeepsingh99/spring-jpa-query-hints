package com.portal.jpa.controller;

import ch.qos.logback.core.model.INamedModel;
import com.portal.jpa.model.Customer;
import com.portal.jpa.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers/salary/{amount}")
    public List<Customer> getCustomers(@PathVariable double amount) {

        return customerService.findCustomerWithSalaryGreaterThan(amount);
    }
}
