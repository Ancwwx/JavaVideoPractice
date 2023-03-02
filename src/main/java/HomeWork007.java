public class HomeWork007 {
	public static void main(String[] args) {
		Dog1 dog1 = new Dog1("cc", "black", 1);
		Dog1 dog2 = new Dog1("gou", "yellow", 3);
		dog1.show();
		dog2.show();

	}
}

class Dog1 {
	String name;
	String color;
	int age;

	public Dog1(String name, String color, int age) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public void show() {
		System.out.println("name=" + this.name + " color=" + this.color + " age=" + this.age);

	}
}
