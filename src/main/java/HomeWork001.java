public class HomeWork001 {
	public static void main(String[] args) {
		double arr[] = { 1.9, 3, 5, 7, 9.4 };
		A01 n = new A01();
		Double res = n.max(arr);
		if (res != null) {
			System.out.println("arr最大值是 " + n.max(arr));
		} else {
			System.out.println("arr输入有误");
		}

	}
}

class A01 {
	public Double max(double[] arr) {

		if (arr != null && arr.length > 0) {

			double max = arr[0];
			for (int i = 1; i < arr.length; i++) {

				if (max < arr[i]) {
					max = arr[i];
				}
			}
			return max;
		} else {
			return null;
		}

	}
}