import java.util.Scanner;
public class NestedIf{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入该歌手的成绩");
		
		double score = myScanner.nextDouble();

		if(score > 8.0) {
			System.out.println("请输入该歌手的性别");
			char gender = myScanner.next().charAt(0);
			if(gender == '男') {
				System.out.println("进入男子决赛组");
			} 
			else if (gender == '女') {
				System.out.println("进入女子决赛组");
			}else {
				System.out.println("你的性别有误，不能参加决赛");
			}
		}
			else {
			  System.out.println("淘汰");
			}
			
		
	}
	
}