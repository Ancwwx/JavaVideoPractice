public class ArrayExercise03 {
	public static void main(String[] args) {
		double[] n = { 4, -1, 9, 10, 23 };
		double sum = 0;
		double a = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + n[i];
			a = sum / n.length;

		}
		System.out.println("和=" + sum + "平均值=" + a);
	}
}