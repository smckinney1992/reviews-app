package inheirtance;

import java.util.Objects;

public class product {
	private int productId;
	private String productName;
	private int quanityOnHand;
	private int price;
	private int star;
	
	public product() {
		
	}
	public product(int productId, String productName, int quanityOnHand, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quanityOnHand = quanityOnHand;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuanityOnHand() {
		return quanityOnHand;
	}
	public void setQuanityOnHand(int quanityOnHand) {
		this.quanityOnHand = quanityOnHand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	
	
	@Override
	public String toString() {
		return "product [productId=" + productId + ", productName=" + productName + ", quanityOnHand=" + quanityOnHand
				+ ", price=" + price + ", star=" + star + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(price, productId, productName, quanityOnHand);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		product other = (product) obj;
		return price == other.price && productId == other.productId && Objects.equals(productName, other.productName)
				&& quanityOnHand == other.quanityOnHand;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
