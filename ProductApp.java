package inheirtance;

public class ProductApp {
	
	public static void main(String[] args) {
		product product1 = new product(1, "Lakme", 199, 99);
		product product2 = new product(1, "Lakme", 199, 99);
		
		System.out.println(product1);
		System.out.println(product1);
		
		System.out.println(product1.equals(product2));
		System.out.println(product1 == product2);
		
		product product3 = product1;
		
		System.out.println(product1.equals(product3));
		System.out.println(product1 == product3);
		
		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());
		System.out.println(product3.hashCode());
		
	}

}
