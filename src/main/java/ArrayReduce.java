import java.util.Scanner;

public class ArrayReduce {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		Scanner myScanner = new Scanner(System.in);
		do {
			int[] arrNew = new int[arr.length - 1];
			for (int i = 0; i < arr.length - 1; i++) {
				arrNew[i] = arr[i];
			}
			arr = arrNew;
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}

			System.out.println("\n" + "是否继续缩减 y/n");
			char key = myScanner.next().charAt(0);
			if (key == 'n') {
				break;
			} else if (arr.length == 1) {
				System.out.println("不能再缩减");
				break;
			}
		} while (true);
	}
}
