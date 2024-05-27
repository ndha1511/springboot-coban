package com.code.springbootcoban.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;
    @Column(name = "employee_name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
