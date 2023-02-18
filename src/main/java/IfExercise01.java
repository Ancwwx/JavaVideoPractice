import java.util.Scanner;
public class IfExercise01{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		double n1 = myScanner.nextDouble();
		System.out.println("请输入第二个数字");
		double n2 = myScanner.nextDouble();
		if(n1 > 10.0 && n2 <20.0) {
		System.out.println("n1+n2=" + (n1+n2));
		}
		
	}
	
}