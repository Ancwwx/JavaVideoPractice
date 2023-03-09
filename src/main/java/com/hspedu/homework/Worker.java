package com.hspedu.homework;

public class Worker extends Employee {

	public Worker(String name, int workDays, double daySal, double grade) {
		super(name, workDays, daySal, grade);
		// TODO Auto-generated constructor stub
	}
	public void printSal() {
		System.out.print("普通员工 ");
		super.printSal();
	}

}
