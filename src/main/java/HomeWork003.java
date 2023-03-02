public class HomeWork003 {
	public static void main(String[] args) {
		Book b = new Book("笑傲江湖", 120);
		b.info();
		b.updatePrice();
		b.info();
	}
}

class Book {
	String name;
	double price;

	public Book(String name, int price) {
		this.name = name;
		this.price = price;

	}

	public void updatePrice() {
		if (price > 150) {
			price = 150;
		} else if (price > 100) {
			price = 100;
		}
	}

	public void info() {
		System.out.println(this.name + this.price);
	}
}