public class Test01{
	public static void main(String[] args) {
		int x = 5;
		int y = 5;
		if(x++ == 6 & ++y == 6) {
			x=11;
		}
		System.out.println("x=" + x + "y=" + y);
		
		int a = 5;
		int b = 5;
		if(a++ == 6 && ++b == 6) {
			a=11;
		}
		System.out.println("a=" + a + "b=" + b);
		
		int j = 5;
		int k = 5;
		if(j++ == 5 | ++k == 5) {
			j=11;
		}
		System.out.println("j=" + j + "k=" + k);
		
		int m = 5;
		int n = 5;
		if(m++ == 5 || ++n == 5) {
			m=11;
		}
		System.out.println("m=" + m + "n=" + n);
		
		
		
		
	}
}