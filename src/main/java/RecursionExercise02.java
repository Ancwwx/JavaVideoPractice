public class RecursionExercise02 {
	public static void main(String[] args) {
		T2 day = new T2();
		int n = 10;
		int Num = day.peach(n);
		if (Num != -1) {
			System.out.println("在 第" + n + "天 有" + Num + "个🍑");
		}

	}
}

class T2 {
	public int peach(int day) {
		if (day == 10) {
			return 1;
		} else if (day >= 1 && day <= 9) {
			return (peach(day + 1) + 1) * 2;
		} else {
			System.out.println("day在1-10");
			return -1;
		}

	}
}