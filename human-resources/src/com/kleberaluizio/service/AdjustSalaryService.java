package com.kleberaluizio.service;

import com.kleberaluizio.model.Employee;
import com.kleberaluizio.model.ExceptionValidation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class AdjustSalaryService implements  AdjustSalary{
    @Override
    public void adjustSalary(Employee employee, BigDecimal raise) {

        BigDecimal currentSalary = employee.getSalary();
        BigDecimal adjustPercentage = raise.divide(currentSalary, RoundingMode.HALF_UP);

        if (adjustPercentage.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ExceptionValidation("Adjust cannot be over 40% of its salary!");
        }
        BigDecimal adjustSalary = currentSalary.add(raise);
        employee.updateSalary(adjustSalary);

    }
}
