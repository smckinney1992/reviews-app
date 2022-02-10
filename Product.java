package consdemo;
//default constructor
public class Product {
	
	int productId;
	String productName;
	int quanityOnHand;
	int price;
	int star=5;
	
	public Product() {
		productId=-1;
		productName="NotAvailable";
		quanityOnHand=-1;
		price=-1;
		star=-1;
		
		System.out.println("PRODUCT CONSTRUCTOR CALLED");
	}
	//parameterized constructor
	public Product(int productId, String productName, int quanityOnHand, int price, int star) {
		this();
		this.productId = productId;
		this.productName = productName;
		this.quanityOnHand = quanityOnHand;
		this.price = price;
		this.star = star;
	}

	public Product(int productId, String productName, int quanityOnHand) {
		this();
		this.productId = productId;
		this.productName = productName;
		this.quanityOnHand = quanityOnHand;
	}
	
	public Product(int productId, int price, int star) {
		this();
		this.productId = productId;
		this.price = price;
		this.star = star;
	}
	public void printProductDetails() {
		int star=4;
		System.out.println("Product Id : " +productId);
		System.out.println("Product Name : " +productName);
		System.out.println("Quanity On Hand : " +quanityOnHand);
		System.out.println("Price : " +price);
		System.out.println("Star : "+star);
		System.out.println("Instance star : "+this.star);
	}
	
	public static void main(String[] args) {
		
		Product product1 = new Product();
		System.out.println("Printing the details about product1");
		product1.printProductDetails();
		
		Product product2 = new Product();
		System.out.println("Printing the details about product2");
		product2.printProductDetails();
		
		new Product().printProductDetails();
		
		Product product3 = new Product(2,"Aroma",12,99,3);
		product3.printProductDetails();
		System.out.println("Printing the details about product3");
		
		Product product4 = new Product(768,"Pendrive", 99);
		product4.printProductDetails();
		System.out.println("Printing the details about product4");
		
		Product product5 = new Product(500, 89, 3);
		product5.printProductDetails();
		
	}

}
