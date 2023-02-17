public class Store03 {
  String productType;
  int inventoryCount;
  double inventoryPrice;
  
  public Store03(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }
  
  public static void main(String[] args) {
    Store03 cookieShop = new Store03("cookies", 12, 3.75);
  }
}