package com.kleberaluizio.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {
    private String name;
	private String cpf;
	private Role role;
	private BigDecimal salary;
	private LocalDate lastAdjustDate;

	public Employee(String nome, String cpf, Role role, BigDecimal salary) {
		this.name = nome;
		this.cpf = cpf;
		this.role = role;
		this.salary = salary;
	}

	public void updateSalary(BigDecimal newSalary) {
		this.salary = newSalary;
		this.lastAdjustDate = LocalDate.now();
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

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public LocalDate getLastAdjustDate() {
		return lastAdjustDate;
	}

	public void setLastAdjustDate(LocalDate lastAdjustDate) {
		this.lastAdjustDate = lastAdjustDate;
	}

}