package com.hspedu.homework;

public class Employee {
	private String name;
	private int workDays;
	private double daySal;
	private double grade;
	public Employee() {
		
	}

	public Employee(String name, int workDays, double daySal, double grade) {
		this.name = name;
		this.workDays = workDays;
		this.daySal = daySal;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWorkDays() {
		return workDays;
	}

	public void setWorkDays(int workDays) {
		this.workDays = workDays;
	}

	public double getDaySal() {
		return daySal;
	}

	public void setDaySal(double daySal) {
		this.daySal = daySal;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public void printSal() {
		System.out.println(name + "工资是" + daySal * workDays * grade);
	}

}
