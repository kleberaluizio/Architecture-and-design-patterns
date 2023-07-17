package com.kleberaluizio.model;

import java.math.BigDecimal;

public class OutsourcedEmployee extends Employee{

    private String company;


    public OutsourcedEmployee(String nome, String cpf, Role role, BigDecimal salary) {
        super(nome, cpf, role, salary);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
