package com.code.springbootcoban.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

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
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    // bắt buộc nhập
    @Column(name = "address")
    private String address;
    // lớn hơn 18 nhỏ hơn 60
    @Column(name = "age")
    private int age;
    // bắt buộc, lớn hơn 18 nhỏ hơn 60
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
