package inheirtance;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer data = new StringBuffer("Hello");
		System.out.println("Default capacity :"+data.capacity());
		
		
		data.append(" Richard");
		
		System.out.println("Length after adding Richard "+data.length());
		System.out.println("Current capacity :"+data.capacity());
		data.append("pppppppp");
		System.out.println("Length after adding pppppppp "+data.length());
		System.out.println("Current capacity :"+data.capacity());
		data.append("p");
		System.out.println("Length after adding p "+data.length());
		System.out.println("New capacity :"+data.capacity());
		
		
		System.out.println(data.capacity());
	}

}
