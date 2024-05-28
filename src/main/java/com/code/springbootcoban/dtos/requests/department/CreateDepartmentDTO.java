package com.code.springbootcoban.dtos.requests.department;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateDepartmentDTO {
    @NotBlank(message = "name must be not blank")
    private String name;
    @Pattern(regexp = "^0\\d{9}", message = "phone is invalid")
    private String phone;
    @Pattern(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$", message = "email is invalid")
    private String email;
    private Long countryId;
}
