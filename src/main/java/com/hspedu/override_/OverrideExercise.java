package com.hspedu.override_;

public class OverrideExercise {
	public static void main(String[] args) {
		Person person = new Person("jake", 19);
		System.out.println(person.say());

		Student student = new Student("smith", 20, 3344233, 98.9);
		System.out.println(student.say());
	}
}
