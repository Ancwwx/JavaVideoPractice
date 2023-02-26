public class MethodExercise02 {
	public static void main(String[] args) {
		int[][] arr = { { 0, 0, 1 }, { 1, 1, 1 }, { 1, 1, 3 } };
		MyTools01 tools = new MyTools01();
		tools.printArr(arr);
		Person p = new Person();
		p.name = "A";
		p.age = 10;
		Person p2 = tools.copyPerson(p);
		System.out.println(p.age + p.name);
		System.out.println(p2.age + p2.name);
		System.out.println(p == p2);
	}

}

class Person {
	String name;
	int age;
}

class MyTools01 {
	public void printArr(int[][] arr) {
		for (int a = 0; a < arr.length; a++) {
			for (int b = 0; b < arr[a].length; b++) {
				System.out.print(arr[a][b]);
			}
			System.out.println();
		}

	}

	public Person copyPerson(Person p) {
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	}

}
