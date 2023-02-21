public class MulForExercise04 {
	public static void main(String[] args) {
		int lineCount = 11;
		for (int i = 1; i <= lineCount; i++) {
			int starCount = 0;
			if (i <= (lineCount + 1) / 2) {
				starCount = 2 * i - 1;

			} else {
				starCount = (lineCount - i) * 2 + 1;
			}
			for (int a = 1; a <= (lineCount - starCount) / 2; a++) {
				System.out.print(' ');
			}
			for (int r = 1; r <= starCount; r++) {
				if(r==1||r==starCount) {
					System.out.print("*");
				}
				else{
					System.out.print(' ');
				}
			}
	

			System.out.println();

		}
	}
}

//public class MulForExercise04 {
//	public static void main(String[] args) {
//		
//		int lineCount=10;
//		for (int r = 1; r <= lineCount; r++) {
//			// 每一行的星数
//			int count = 0;
//			if (r <= (lineCount + 1) / 2) {
//				count = 2 * r - 1;
//			} else {
//				count = 2 * (lineCount - r) + 1;
//			}
//
//			// 计算每一行🌟之前的空格数
//			int spaceCount = (lineCount - count) / 2;
//			// 开始画每一行的空格
//			for (int s = 1; s <= spaceCount; s++) {
//				System.out.print(' ');
//			}
//
//			// 每一行的✨
//			for (int n = 1; n <= count; n++) {
//				if (n == 1 || n == count) {
//					System.out.print('*');
//				} else {
//					System.out.print(' ');
//				}
//
//			}
//
//			// 这一行画完了，换行
//			System.out.println();
//
//		}
//	}
//}