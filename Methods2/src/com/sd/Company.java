package com.sd;

public class Company {
	

	public Company(String name, int salary, String skill) {
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee Sam = new employee("Sam", 62000, "MLT");
		Sam.raiseSalary(Sam.getSalary(), 23);
		
		System.out.println(Sam.toString());
		
	}

}
