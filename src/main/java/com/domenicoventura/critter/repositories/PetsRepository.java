package com.domenicoventura.critter.repositories;

import com.domenicoventura.critter.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface PetsRepository extends JpaRepository<Pet, Long> {

    List<Pet> getAllByCustomerId(Long customerId);

}