import java.util.Scanner;
public class DoWhileExercise03{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("打打打打打");
			System.out.println("还钱吗");
			answer = myScanner.next().charAt(0);
			System.out.println("他的回答是"+answer);
		}while(answer !='y');
		System.out.println("还钱了");
	}
}