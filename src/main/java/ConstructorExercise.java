public class ConstructorExercise {
	public static void main(String[] args) {
		Person07 p1 = new Person07();
		System.out.println("p1的信息 name=" + p1.name + "  age=" + p1.age);
		Person07 p2 = new Person07("scott", 50);
		System.out.println("p2的信息 name=" + p2.name + "  age=" + p2.age);
	}
}

class Person07 {
	int age;
	String name;

	public Person07() {
		age = 18;
	}

	public Person07(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
}