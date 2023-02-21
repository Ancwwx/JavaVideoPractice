public class MulForExercise03 {
	public static void main(String[] args) {

		int lineCount = 5;

		for (int i = 1; i <= lineCount; ++i) {

			for (int s = 1; s <= lineCount - i; ++s) {
				System.out.print(' ');
			}

			for (int n = 1; n <= i * 2 - 1; ++n) {
				if (n == 1 || n == i * 2 - 1 || i == lineCount) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}

			System.out.println();

		}
	}
}

// for (int n = 1; n <= i * 2 - 1; ++n) {
//				for(int s=1;s<=lineCount-i;++s) {
//					System.out.print(" ");
//				}
//				System.out.print('*');
//			}

//			for(int s = 1; s <= lineCount - i; ++s )
//			{
//				System.out.print(' ');
//			}
//			
//			
//			for(int j = 1; j <= 2 * i - 1; ++j)
//			{
//				
//				
//				
//				System.out.print('*');
//			}

//			for(int j=0; j<i+lineCount; ++j)
//			{
//				if(j < lineCount - i - 1)
//				{
//					System.out.print(' ');
//				}else
//				{
//					System.out.print('*');	
//				}
//				
//				
//				
//			}
//			
// System.out.print("\n");
//			

// }

//		for(int i ;;;;;;;= 1;i<=5;i++) {
//			for(int j = 1;j<=5;i=5)
//			System.out.println("*****");
//		}
//	}
//}