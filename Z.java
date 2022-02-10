class W {
	public W() {
		System.out.println("W constructor");
	}
}
public class Z {
	
	W w = new W();
	{
		System.out.println("instance block");
	}
	static {
		System.out.println("static block");
	}
	
	public Z() {
		System.out.println("Z constructor");
	}
	public static void main(String[] args) {
		System.out.println("In main");
		Z z1 = new Z();
		Z z2 = new Z();
	}

}
