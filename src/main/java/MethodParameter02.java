public class MethodParameter02 {
	public static void main(String[] args) {
		Person09 p = new Person09();
		p.sal = "ww";
		p.age = 19;

		B01 b = new B01();
		int[] arr = { 1, 2, 3 };
		b.test100(arr);
		b.test200(p);

		System.out.println(p.sal);
		System.out.println(p.age);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}

class Person09 {
	String sal;
	int age;
}

class B01 {
	public void test100(int[] arr) {
		arr[0] = 200;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	public void test200(Person09 p250) {
		p250.sal = "zzz";
		p250.age = 5;
	}
}