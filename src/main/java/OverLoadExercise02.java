public class OverLoadExercise02 {
	public static void main(String[] args) {
		Methods01 method = new Methods01();

		System.out.println(method.max(10.9, 24.1, 11));
	}
}

class Methods01 {
	public int max(int a, int b) {
		return a > b ? a : b;
	}

	public double max(double a, double b) {
		return a > b ? a : b;
	}

	public double max(double a, double b, double c) {

		double max1 = a > b ? a : b;
		return max1 > c ? max1 : c;

	}
}