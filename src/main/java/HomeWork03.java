public class HomeWork03 {
	public static void main(String[] args) {
	int Num =153;
	int a=Num/100;
	int b=Num%100/10;
	int c=Num%10;
	if (a*a*a+b*b*b+c*c*c==Num) {
		System.out.println(Num+"是水仙花数字");
	}else {
	 
	System.out.println(Num+"不是水仙花数字");
	}
	
	}
	}