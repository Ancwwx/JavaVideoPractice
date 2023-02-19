public class For01 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {

			System.out.println("ILvBB" + i);
		}

		int n = 2; // 循环变量初始化
		for (; n < 9;) {
			System.out.println("BBLvSo");
			n++;
		}
		System.out.println(n);
		for (;;) { // 表示一个无限循环，死循环

		}

	}
}