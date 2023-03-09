package com.hspedu.homework.homework13;

public class Homework13 {
	public static void main(String[] args) {
		Teacher teacher = new Teacher("张飞", '男', 30, 5);
		teacher.printInfo();
		System.out.println("---------------------");
		Student student = new Student("小明", '男', 15, "00023102");
		student.printInfo();

	}
}
