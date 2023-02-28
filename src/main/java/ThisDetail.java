public class ThisDetail {
	public static void main(String[] args) {
		TT t2 = new TT();
		t2.f1();
		t2.f2();
	}
}

class TT {
	String name="jack";
	int age=80;

	public TT() {
		this("jack", 100);
		System.out.println("T()构造器");

	}

	public TT(String name, int age) {
		System.out.println("T(String name,int age)构造器");
	}

	public void f1() {
		System.out.println("f1()方法...");
	}

	public void f2() {
		String name="smith";
		System.out.println("name=" + name + " age=" + age);
		System.out.println("name=" + this.name + " age=" + this.age);
		
	}
}