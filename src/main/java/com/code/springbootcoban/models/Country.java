package com.code.springbootcoban.models;

import com.code.springbootcoban.models.enums.Currency;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "countries")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Country {
    @Id
    @Column(name = "country_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "country_name")
    private String name;
    private String continent;
    @Enumerated(EnumType.STRING)
    private Currency currency;
}
