public class Store01{
	String productType;
	public Store01(){
		System.out.println("I am inside the constructor method");
		
	}
	public static void main (String[] args) {
		System.out.println("This code is inside the main method.");
		Store01 lemonadeStand = new Store01();
		System.out.println(lemonadeStand);
	}
	
	
	
}