public class ArithmeticOperator {
	public static void main (String[] args) {
		// /使用
		System.out.println(10 / 4);
		System.out.println(10.0 / 4);
		double d = 10 / 4;
		System.out.println(d);
		// %取模，取余
		//在java中%的本质 看一个公式 a % b =a - a/b * b
		System.out.println(10 % 3);
		System.out.println(-10 % 3);
		System.out.println(10 % -3);
		System.out.println(-10 % -3);
		/*
		 * 作为表达式使用】
		 * 前++：++i先自增，后赋值
		 * 后++：i++先赋值，后自增
		 */
		int j = 8;
		int k = j++;
		System.out.println("k=" + k + "j=" + j);
		
	}
}