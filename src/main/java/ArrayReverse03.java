public class ArrayReverse03 {
	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55, 66 };
		int[] arr1 = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			int a = arr.length - 1 - i;
			arr1[a] = arr[i];
			System.out.print("\t" + arr1[a]);
		}

	}
}