public class HomeWork06 {
	public static void main(String[] args) {
//		double n = 0;
//		double sum = 0;
//		for (double i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				n = -1.0 / i;
//
//			} else {
//				n = 1.0 / i;
//			}
//			sum = n + sum;
//		}
//		System.out.println(sum);
//	}
//}
		double sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum -= 1.0 / i;
			} else {
				sum += 1.0 / i;
			}

		}
		System.out.println("sum=" + sum);
	}
}
