package com.kleberaluizio.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {
	private PersonalData personalData;
	private LocalDate lastAdjustDate;

	public Employee(String nome, String cpf, Role role, BigDecimal salary) {
		this.personalData = new PersonalData(nome, cpf, role, salary);
	}

	public void updateSalary(BigDecimal newSalary) {
		this.salary = newSalary;
		this.lastAdjustDate = LocalDate.now();
	}

	public String getName() {
		return this.personalData.getName();
	}

	public void setName(String name) {
		this.personalData.setName(name);
	}

	public String getCpf() {
		return this.personalData.;
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

	public void promote(Role newRole) {
		this.role = newRole;
	}
}