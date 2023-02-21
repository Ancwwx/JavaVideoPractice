public class Return01{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==3) {
				System.out.println("韩顺平");
				return;//用在方法时，表示跳出方法，如果使用在main，表示退出程序
				       //continue-->终止本次循环;break->终止for循环
			}
			System.out.println("hello World!");
		}
		System.out.println("go on..");
	}
}