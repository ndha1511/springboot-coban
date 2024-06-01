package com.code.springbootcoban.dtos.requests;

import com.code.springbootcoban.models.enums.Currency;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CountryDTO {
    private String name;
    private String continent;
    private Currency currency;
}
