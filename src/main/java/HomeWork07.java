public class HomeWork07 {
	public static void main(String[] args) {
		int sum = 0;
		for (int n = 1; n <= 100; n++) {
			for (int j = 1; j <= n; j++) {
				sum += j;
			}

		}
		System.out.println("sum=" + sum);
	}
}