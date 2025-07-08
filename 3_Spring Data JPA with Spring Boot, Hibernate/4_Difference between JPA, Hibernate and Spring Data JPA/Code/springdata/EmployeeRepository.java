package com.example.demo.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Employee;

/**
 * Spring Data JPA repository simply extends JpaRepository.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
