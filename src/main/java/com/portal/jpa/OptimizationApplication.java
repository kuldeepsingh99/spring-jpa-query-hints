package com.portal.jpa;

import com.portal.jpa.model.Customer;
import com.portal.jpa.repository.CustomerRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootApplication
public class OptimizationApplication {

	/*@Autowired
	CustomerRepository customerRepository;

	@PostConstruct
	void intDB() {
		List<Customer> customers = IntStream.rangeClosed(100001, 200000)
				.mapToObj(i -> new Customer(0L,
						"Customer" + i,
						"customer" + i + "@gmail.com",
						"123-456-789" + (i % 10),
						1000.0 * i,
						"Address " + i,
						20 + (i % 50),
						i % 2 == 0 ? 1 : 0
				))
				.toList();

		customerRepository.saveAll(customers);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(OptimizationApplication.class, args);
	}

}
