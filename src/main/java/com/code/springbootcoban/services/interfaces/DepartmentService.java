package com.code.springbootcoban.services.interfaces;

import com.code.springbootcoban.dtos.requests.department.CreateDepartmentDTO;
import com.code.springbootcoban.exceptions.DataNotFoundException;
import com.code.springbootcoban.models.Department;

public interface DepartmentService {
    Department save(CreateDepartmentDTO createDepartmentDTO) throws DataNotFoundException;
}
