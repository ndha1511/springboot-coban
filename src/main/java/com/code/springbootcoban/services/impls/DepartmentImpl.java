package com.code.springbootcoban.services.impls;

import com.code.springbootcoban.dtos.requests.department.CreateDepartmentDTO;
import com.code.springbootcoban.exceptions.DataNotFoundException;
import com.code.springbootcoban.mappers.DepartmentMapper;
import com.code.springbootcoban.models.Country;
import com.code.springbootcoban.models.Department;
import com.code.springbootcoban.repositories.CountryRepository;
import com.code.springbootcoban.repositories.DepartmentRepository;
import com.code.springbootcoban.services.interfaces.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DepartmentImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final CountryRepository countryRepository;
    @Override
    public Department save(CreateDepartmentDTO createDepartmentDTO) throws DataNotFoundException{
        Country country = countryRepository
                .findById(createDepartmentDTO
                        .getCountryId()).orElseThrow(() -> new DataNotFoundException("role not found"));
        Department department = DepartmentMapper.createDepartmentDTO2Department(createDepartmentDTO);
        department.setCountry(country);
        return departmentRepository.save(department);
    }
}
