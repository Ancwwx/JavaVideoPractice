public class ForExercise {
	public static void main(String[] args) {

		int count = 0;
		int sum = 0;
		int start = 1;
		int end = 100;
		int t = 9;
		for (int i = start; i <= end; i++) {
			if (i % t == 0) {
				System.out.println("i=" + i);
			}
			sum += i;
			count++;
		}

		System.out.println("count=" + count +"\n"+ "sum=" + sum);
	}
}