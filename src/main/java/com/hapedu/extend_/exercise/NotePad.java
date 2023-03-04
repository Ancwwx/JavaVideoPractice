package com.hapedu.extend_.exercise;

public class NotePad extends PC{
	private String color;
	public NotePad(String cpu,int memory,int disk,String brand,String color) {
		super(cpu,memory,disk,brand);
		this.color=color;
	}
	public void setcolor(String color) {
		this.color=color;
	}
	public void printInfo() {
		System.out.println("PC信息=");
		System.out.println(getDetails()+" brand:"+getBrand()+" color:"+color);
	}
}
