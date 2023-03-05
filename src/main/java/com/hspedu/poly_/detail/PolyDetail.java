package com.hspedu.poly_.detail;

public class PolyDetail {
	public static void main(String[] args) {
		Animal animal = new Cat();
		Object obj=new Cat();
		System.out.println("ok!");
		
		animal.eat();
		animal.run();
		animal.sleep();
		animal.show();
		Cat cat =(Cat) animal;
		cat.catchMouse();
	//	Dog dog=(Dog) animal; 错误
		
	}
}

