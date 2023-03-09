package com.hspedu.homework;

public class Demo extends Test{
	String name="jack";
	Demo(){
		super();
		System.out.println("Demo");
	}
	Demo(String s){
		super(s);
		
	}
	public void test() {
		System.out.println(super.name);
		System.out.println(this.name);
	}


}
