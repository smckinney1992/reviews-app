package inheirtance;
class Order{
	int i;
	static {
		System.out.println("Order class static block ");
	}
	Order(){
		i=10;
		System.out.println("Order class constructor,i= " + i);
	}
	{
		System.out.println("Order class instance block,i= " +i);
	}
}
public class SubOrder extends Order{
	int j = 9;
	static {
		System.out.println("SubOrder class static block");
	}
	SubOrder(){
		j = 15;
		System.out.println("SubOrder class constructor,j= " + j);
	}
	{
		System.out.println("Suborder class instance block,j= " + j);
	}
	public static void main(String[] args) {
		new SubOrder();
	}
}