package com.domenicoventura.critter.repositories;

import com.domenicoventura.critter.entities.Employee;
import com.domenicoventura.critter.entities.Pet;
import com.domenicoventura.critter.entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchedulesRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> getAllByPetsContains(Pet pet);

    List<Schedule> getAllByEmployeesContains(Employee employee);

    List<Schedule> getAllByPetsIn(List<Pet> pets);
}