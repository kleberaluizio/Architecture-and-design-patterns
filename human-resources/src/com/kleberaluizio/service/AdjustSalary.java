package com.kleberaluizio.service;

import com.kleberaluizio.model.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public interface AdjustSalary {
    void adjustSalary(Employee employee, BigDecimal raise);

}
