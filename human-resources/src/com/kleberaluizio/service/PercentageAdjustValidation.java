package com.kleberaluizio.service;

import com.kleberaluizio.model.Employee;
import com.kleberaluizio.model.ExceptionValidation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PercentageAdjustValidation implements AdjustSalaryValidation{

    @Override
    public void validate (Employee employee, BigDecimal raise){

        BigDecimal currentSalary = employee.getSalary();
        BigDecimal adjustPercentage = raise.divide(currentSalary, RoundingMode.HALF_UP);

        if (adjustPercentage.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ExceptionValidation("Adjust cannot be over 40% of its salary!");
        }

    }
}
