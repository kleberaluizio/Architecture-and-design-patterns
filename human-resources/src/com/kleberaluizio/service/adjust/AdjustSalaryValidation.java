package com.kleberaluizio.service.adjust;

import com.kleberaluizio.model.Employee;

import java.math.BigDecimal;

public interface AdjustSalaryValidation {
    void validate(Employee employee, BigDecimal raise);

}
