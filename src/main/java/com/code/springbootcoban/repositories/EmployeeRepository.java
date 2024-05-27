package com.code.springbootcoban.repositories;

import com.code.springbootcoban.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
