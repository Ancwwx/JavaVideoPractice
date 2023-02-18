public class SwitchExercise01 {
	public static void main(String[] args) {
		double score = 0.01;

		if (score >= 1 && score <= 100) {
			switch ((int) (score / 60)) {
			case 1:
				System.out.println("合格");
				break;
			case 0:
				System.out.println("不合格");
				break;
			}
		} else {
			System.out.println("输入成绩有误");

		}
	}
}