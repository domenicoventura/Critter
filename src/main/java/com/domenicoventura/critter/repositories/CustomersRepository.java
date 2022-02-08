package com.domenicoventura.critter.repositories;

import com.domenicoventura.critter.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CustomersRepository extends JpaRepository<Customer, Long> {
}