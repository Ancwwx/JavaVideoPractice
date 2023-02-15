public class ArithmeticOperatorExercise02{
		public static void main(String[] args) {
  int days = 40;
  int weeks = days / 7;
  int leftDays = days % 7;
  System.out.println(days + "天 合" + weeks + "星期零" + leftDays + "天");
  
  double hw = 234.5;
  double sw = 5.0 / 9 * (hw - 100);
  System.out.println("华氏温度" + hw + "对应的摄氏温度是" + sw );
		
	}
}