public class MethodDetail02 {
	public static void main(String[] args) {
    A a = new A();
    a.sayOk();
    a.m1();
	}
}

class A {
	public void print(int n) {
		System.out.println("print方法被调用 n=" + n);
	}

	public void sayOk() {
		print(10);
		System.out.println("继续执行sayOk()~~~");
	}

	public void m1() {
		System.out.println("m1() 方法被调用");
		B b = new B();
		b.hi();
	}
}

class B {
	public void hi() {
		System.out.println("B类中的hi()被执行");
	}

}