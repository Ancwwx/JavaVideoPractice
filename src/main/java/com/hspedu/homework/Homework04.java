package com.hspedu.homework;

public class Homework04 {
	public static void main(String[] args) {
		Manager manage=new Manager("刘备",20,100,1.2);
		manage.setBonus(3000);
		manage.printSal();
		
		Worker worker=new Worker("关羽",10,50,1.0);
		worker.printSal();
	}

}
