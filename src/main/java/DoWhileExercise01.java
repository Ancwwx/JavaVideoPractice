public class DoWhileExercise01 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		do {
			System.out.println("i=" + i);
			sum = sum + i;
			i++;

		} while (i <= 100);

		System.out.println("sum=" + sum);
	}
}