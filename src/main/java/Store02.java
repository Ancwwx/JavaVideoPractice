public class Store02 {
  String productType;
  
  public Store02(String product) {
    productType = product;
  }
 
  public static void main(String[] args) {
    Store02 lemonadeStand = new Store02("lemonade");
    System.out.println(lemonadeStand.productType);
    
  }
}