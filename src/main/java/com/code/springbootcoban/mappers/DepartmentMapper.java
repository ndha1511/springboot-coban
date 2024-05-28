package com.code.springbootcoban.mappers;

import com.code.springbootcoban.dtos.requests.department.CreateDepartmentDTO;
import com.code.springbootcoban.models.Department;

public class DepartmentMapper {
    public static Department createDepartmentDTO2Department(CreateDepartmentDTO createDepartmentDTO) {
        return Department.builder()
                .name(createDepartmentDTO.getName())
                .email(createDepartmentDTO.getEmail())
                .phone(createDepartmentDTO.getPhone())
                .build();
    }
}
