public class TestPerson {
	public static void main(String[] args) {
		Person03 p1 = new Person03("mary", 30);
		Person03 p2 = new Person03("mary", 30);
		System.out.println("p1和p2的比较结果为 " + p1.compareTo(p2));
	}
}

class Person03 {
	String name;
	int age;

	public Person03(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean compareTo(Person03 p) {
		return this.name.equals(name) && this.age == p.age;

	}
}