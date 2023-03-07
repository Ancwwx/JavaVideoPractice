package com.hspedu.Object_;

public class EqualsExercise02 {
	public static void main(String[] args) {
		Person01 p1 = new Person01();
		p1.name = "hspedu";
		Person01 p2 = new Person01();
		p2.name = "hspedu";

		System.out.println(p1 == p2);//f
		System.out.println(p1.name.equals(p2.name));//t
		System.out.println(p1.equals(p2));//f  没有重写

		String s1 = new String("asdf");
		String s2 = new String("asdf");
		System.out.println(s1.equals(s2));//t
		System.out.println(s1 == s2);//f

	}
}

class Person01 {
	public String name;
}