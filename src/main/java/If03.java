import java.util.Scanner;
public class If03{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入保国的芝麻信用积分(1-100)");
		int num = myScanner.nextInt();
	if(num >=1 && num <=100) {
		if(num == 100) {
			System.out.println("信用极好");
		}
		else if(num >= 80 ){
			System.out.println("信用优秀");
			
		}
		else if(num >= 60) {
			System.out.println("信用一般");
		}
		else{
			System.out.println("信用不及格");
		}
	}else {
			System.out.println("信用积分需要在1-100，请重新输入");
		}
	}
	}
