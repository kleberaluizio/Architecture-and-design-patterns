package com.kleberaluizio.model;

import java.math.BigDecimal;

public class PersonalData {
    private String name;
    private String cpf;
    private Role role;
    private BigDecimal salary;

    public PersonalData(String nome, String cpf, Role role, BigDecimal salary) {
        this.name = nome;
        this.cpf = cpf;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
