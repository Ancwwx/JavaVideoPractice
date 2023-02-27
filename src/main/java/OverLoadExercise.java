public class OverLoadExercise {
	public static void main(String[] args) {
		Methods method = new Methods();
		method.M(10);
		method.M(10, 20);
		method.M("Num");

	}
}

class Methods {
	public void M(int a) {
		System.out.println(a * a);
	}

	public void M(int b, int c) {
		System.out.println(b * c);
	}

	public void M(String str) {
		System.out.println(str);
	}

}