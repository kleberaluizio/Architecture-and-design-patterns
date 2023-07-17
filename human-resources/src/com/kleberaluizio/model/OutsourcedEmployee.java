package com.kleberaluizio.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OutsourcedEmployee{

    private PersonalData personalData;
    private String company;

    public OutsourcedEmployee(String nome, String cpf, Role role, BigDecimal salary, String company) {
        this.personalData = new PersonalData(nome, cpf, role, salary);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return this.personalData.getName();
    }

    public String getCpf() {
        return this.personalData.getCpf();
    }

    public Role getRole() {
        return this.personalData.getRole();
    }

    public BigDecimal getSalary() {
        return this.personalData.getSalary();
    }

}
