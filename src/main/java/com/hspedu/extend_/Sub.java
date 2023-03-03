package com.hspedu.extend_;

public class Sub extends Base{
	public Sub() {
		System.out.println("sub()...");
	}
	public void sayOk() {
		System.out.println("n1="+n1+"n2="+n2+"n3="+n3+"n4="+getN4());
		test100();
		test200();
		test300();
		callTest400();
		
	}

}
