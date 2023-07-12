package com.kleberaluizio.service;

import com.kleberaluizio.model.Employee;

import java.math.BigDecimal;
import java.util.List;

public class AdjustSalaryService{

    private List<AdjustSalaryValidation> validations;

    public AdjustSalaryService(List<AdjustSalaryValidation> validations) {
        this.validations = validations;
    }

    public void adjustSalary(Employee employee, BigDecimal raise) { 
        this.validations.forEach(v -> v.validate(employee,raise));

        BigDecimal adjustSalary = employee.getSalary().add(raise);
        employee.updateSalary(adjustSalary);
    }
}
