public class Constructor01 {
	public static void main(String[] args) {
		Man p1 = new Man("smith", 80);
		System.out.println("p1的信息如下");
		System.out.println(p1.name);
		System.out.println(p1.age);
	}
}

class Man {
	String name;
	int age;

	public Man(String pName, int pAge) {
		System.out.println("构造器被调用，完成对象的属性初始化");
		name = pName;
		age = pAge;

	}
}