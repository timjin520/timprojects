package com.hexagon.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexagon.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
