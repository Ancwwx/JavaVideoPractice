package com.hspedu.homework.homework5;

public class Scientist extends Employee {
	private double bonus;

	public Scientist(String name, double sal) {
		super(name, sal);
		// TODO Auto-generated constructor stub
	}
	

	public double getBonus() {
		return bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	public void printSal() {
		System.out.print("科学家 ");
		System.out.println(getName() + "年工资为:" +( getSal() * getSalMonth() + bonus));
	}
}
