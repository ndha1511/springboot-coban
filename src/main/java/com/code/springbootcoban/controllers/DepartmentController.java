package com.code.springbootcoban.controllers;

import com.code.springbootcoban.dtos.requests.department.CreateDepartmentDTO;
import com.code.springbootcoban.dtos.responses.ResponseSuccess;
import com.code.springbootcoban.exceptions.DataNotFoundException;
import com.code.springbootcoban.services.interfaces.DepartmentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/departments")
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;

    @PostMapping
    public ResponseSuccess<?> create(@Valid @RequestBody CreateDepartmentDTO departmentDTO) throws DataNotFoundException {
            return new ResponseSuccess<>(
                    HttpStatus.OK.value(),
                    "create department successfully",
                    departmentService.save(departmentDTO));
    }
}
