public class LogicOperator02{
	public static void main(String[] args) {
	  int age = 50;
	 //短路或
	  if(age > 20 || age < 90) {
		   System.out.println("ok100");		
	  }
	  //逻辑或
	  if(age > 20 | age < 90) {
		   System.out.println("ok200");
	
	  }
	  
	  int a = 4;
	  int b = 9;
	  if(a > 1 || ++b > 4) {
	   System.out.println("ok300");
  }
	   System.out.println("a=" + a + "b=" + b);
	
	  int c = 4;
	  int d = 9;
	  if(c > 1 | ++d > 4) {
	   System.out.println("ok400");
 }
	   System.out.println("c=" + c + "d=" + d);
	}
		}