package com.code.springbootcoban.repositories;

import com.code.springbootcoban.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
