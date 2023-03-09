package com.hspedu.homework.homework5;

public class Worker extends Employee{

	public Worker(String name, double sal) {
		super(name, sal);
		// TODO Auto-generated constructor stub
	}
	public void printSal() {
		System.out.print("工人 ");
		super.printSal();
	}

}
