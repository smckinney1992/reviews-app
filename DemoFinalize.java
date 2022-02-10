package inheirtance;
class Customer{
	
	int customerId;
	String customerName;
	
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("FINALIZE CALLED");
		super.finalize();
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	
}
public class DemoFinalize {

	public static void main(String[] args) {
		Customer customer1 = new Customer(122,"Richard");
		
		System.out.println(customer1);
		System.out.println(customer1.toString());
		
		System.gc();

	}

}
