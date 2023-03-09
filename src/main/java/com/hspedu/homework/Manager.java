package com.hspedu.homework;

public class Manager extends Employee {
	private double bonus;

	public Manager(String name, int workDays, double daySal, double grade) {
		super(name, workDays, daySal, grade);
	}

	public void printSal() {
		System.out.println("经理 " + getName() + "工资是" + (bonus + getDaySal() * getWorkDays() * getGrade()));
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}
