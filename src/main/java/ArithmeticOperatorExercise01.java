public class ArithmeticOperatorExercise01{
	public static void main(String[] args) {
		int i = 1;
		i = i++;
		System.out.println(i);
		
		int b = 1;
		int c = ++b;
		System.out.println(c);
		
		int i1 = 10;
		int i2 = 20;
		int i3 = i1++;
		System.out.print("i3=" + i3);
		System.out.println("i2=" + i2);
		
		int i5 = --i2;
		System.out.print("i5=" + i5);
		System.out.println("i2=" + i2);
		
		
	}
}