import java.util.Scanner;

public class IfExercise04 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份");
		short mon = myScanner.nextShort();
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();

		if (mon >= 4 && mon <= 10) {

			if (age >= 18 && age <= 60) {
				System.out.println(mon + "月，成人票价是60");
			} else if (age < 18) {
				System.out.println(mon + "月，儿童票价是半价");
			} else {
				System.out.println(mon + "月，老人票价是1/3");
			}
		} else {
			if (age > 60) {
				System.out.println(mon + "月，老人票价是40");
			} else
				System.out.println(mon + "月，票价是20");

		}

	}
}