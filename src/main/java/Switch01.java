import java.util.Scanner;
public class Switch01{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入字符(a~g）");
		char n = myScanner.next().charAt(0);
		switch(n) {
		  case'a' : System.out.println("表示星期一");
		  break;
		  case'b' : System.out.println("表示星期二");
		  break;
		  case'c' : System.out.println("表示星期三");
		  break;
		  case'd' : System.out.println("表示星期四");
		  break;
		  case'e' : System.out.println("表示星期五");
		  break;
		  case'f' : System.out.println("表示星期六");
		  break;
		  case'g' : System.out.println("表示星期七");
		  break;
		  default:
			  System.out.println("你输入的字符不正确，没有匹配项");
		}
		System.out.println("退出了Switch，继续执行程序");
	}
}
