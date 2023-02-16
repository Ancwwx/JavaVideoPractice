public class TernaryOperator{
	public static void main(String[] args) {
	int a = 10;
	int b = 99;
	int reasult = a < b ? a++ : b--; 
	
	System.out.println("reasult=" + reasult);
	System.out.println("a=" + a);
	System.out.println("b=" + b);
}
	}