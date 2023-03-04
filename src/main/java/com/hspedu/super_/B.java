package com.hspedu.super_;

public class B extends A {
	public int n1=888;
	public void hi() {
		System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
	}
	public void ok() {
		super.test100();
		super.test200();
		super.test300();
	}
	public B() {
		//super();
		super("jake",18);
		
	}
	public void sum() {
		System.out.println("B类的sum()方法...");
		//cal();
		//this.cal();//与cal()一样；
		super.cal();//跳过本类，直接找父类方法；
		System.out.println(n1);
		System.out.println(this.n1);
		System.out.println(super.n1);
	}
}
