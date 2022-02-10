package inheirtance;

public class SBDemo {
	
	public static void main(String[] args) {
		StringBuffer data = new StringBuffer("Mohammad");
		
		System.out.println("Length :"+data.length()); 	//8
		System.out.println("Capacity :"+data.capacity()); //24
		
		data.append("poiuytrewqasdfgh");
		System.out.println("Length :"+data.length());
		System.out.println("Capacity :"+data.capacity());
		data.append("qw");
		System.out.println("Length :"+data.length()); 
		System.out.println("Capacity :"+data.capacity());
	}

}
