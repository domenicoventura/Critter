package com.domenicoventura.critter.repositories;

import com.domenicoventura.critter.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customer, Long> {
}