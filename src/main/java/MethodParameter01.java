public class MethodParameter01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		AAAA obj = new AAAA();
		obj.swap(a, b);
		System.out.println("main方法 a=" + a + "b=" + b);
	}
}

class AAAA {
	public void swap(int a1, int b1) {
		int tmp = a1;
		a1 = b1;
		b1 = tmp;
		System.out.println("\na和b交换后的值\na=" + a1 + "\tb=" + b1);
	}
}