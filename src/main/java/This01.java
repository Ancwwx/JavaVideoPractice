public class This01 {
	public static void main(String[] args) {
		Dog dog1 = new Dog("大壮", 3);
		Dog dog2 = new Dog("大黄", 2);

		dog1.info();
		dog2.info();

	}
}

class Dog {
	String name;
	int age;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void info() {
		System.out.println("name="+name+"   age=" + age);
	}

}