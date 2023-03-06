package com.hspedu.Object_;

public class Equals01 {
	public static void main(String[] args) {
		A a = new A();
		A b = a;
		A c = b;
		System.out.println(a == c);
		System.out.println(b == c);
		B bObj=a;
		System.out.println(bObj == c);
		System.out.println("========================");
		Integer interger1=new Integer(1000);
		Integer interger2=new Integer(1000);
		System.out.println(interger1==interger2);
		System.out.println(interger1.equals(interger2));
		
		String str1=new String("hspedu");
		String str2=new String("hspedu");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		
	}  
}


class B{
	
}
class A extends B{
	

}
