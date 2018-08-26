package com.sd;

public class employee {

	private String name;
	private int salary;
	String skill;
	
	public employee(String name, int salary, String skill) {
		this.name = name;
		this.salary = salary;
		this.skill = skill;
		
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + "\n");
		sb.append(skill + "\n");
		sb.append(salary + "\n");
		
		return sb.toString();
	}

	protected int raiseSalary(int salary, int percentIncrease) {
		this.salary = salary * ((100 + percentIncrease) /100);
		return this.salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
