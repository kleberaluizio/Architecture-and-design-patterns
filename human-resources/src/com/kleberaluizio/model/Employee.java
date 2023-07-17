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
		this.personalData.setSalary(newSalary);
		this.lastAdjustDate = LocalDate.now();
	}

	public String getName() {
		return this.personalData.getName();
	}

	public void setName(String name) {
		this.personalData.setName(name);
	}

	public String getCpf() {
		return this.personalData.getCpf();
	}

	public void setCpf(String cpf) {
		this.personalData.setCpf(cpf);
	}

	public Role getRole() {
		return this.personalData.getRole();
	}

	public void setRole(Role role) {
		this.personalData.setRole(role);
	}

	public BigDecimal getSalary() {
		return this.personalData.getSalary();
	}

	public LocalDate getLastAdjustDate() {
		return lastAdjustDate;
	}

	public void setLastAdjustDate(LocalDate lastAdjustDate) {
		this.lastAdjustDate = lastAdjustDate;
	}

	public void promote(Role newRole) {
		this.personalData.setRole(newRole);
	}
}