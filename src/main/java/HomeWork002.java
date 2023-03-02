public class HomeWork002 {
	public static void main(String[] args) {
		String[] strs = { "jack", "tom", "mary", "milan" };
		A02 f = new A02();
		int n = f.find("milan", strs);
		System.out.println(1);
	}
}

class A02 {
	public int find(String findStr, String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].equals(findStr)) {
				return i;
			}
		}
		return -1;

	}
}