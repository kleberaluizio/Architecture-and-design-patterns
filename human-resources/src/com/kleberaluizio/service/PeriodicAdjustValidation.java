package com.kleberaluizio.service;

import com.kleberaluizio.model.Employee;
import com.kleberaluizio.model.ExceptionValidation;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PeriodicAdjustValidation implements AdjustSalaryValidation{

    @Override
    public void validate (Employee employee, BigDecimal raise) {
        LocalDate dateLastAdjustDate = employee.getLastAdjustDate();
        LocalDate currentData = LocalDate.now();
        int monthsBetweenLastAdjust = currentData.getMonthValue() - dateLastAdjustDate.getMonthValue();
        if (monthsBetweenLastAdjust < 6) {
            throw new ExceptionValidation("Gap between adjusts must be 6 month minimum.");
        }

    }
}
