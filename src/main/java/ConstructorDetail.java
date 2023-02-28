public class ConstructorDetail {
	public static void main(String[] args) {
		Person06 p1 = new Person06("king", 80);
		Person06 p2 = new Person06("tom");
	}
}

class Person06 {
	String name;
	int age;

	public Person06(String pName, int pAge) {
		name = pName;
		age = pAge;
	}

	public Person06(String pName) {
		name = pName;

	}
	
}