package com.code.springbootcoban.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "departments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Department {
    @Id
    @Column(name = "department_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "department_name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
