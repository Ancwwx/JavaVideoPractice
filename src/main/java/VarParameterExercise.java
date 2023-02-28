public class VarParameterExercise {
	public static void main(String[] args) {
		HspMethod01 m = new HspMethod01();
		System.out.println(m.showScore("小小", 78.7, 65, 67.3));
	}
}

class HspMethod01 {
	public String showScore(String name, double... scores) {
		double sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return name + "有" + scores.length + "门课的成绩总分为=" + sum;
	}
}