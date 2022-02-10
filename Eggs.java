import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number of eggs");
		int egg = sc.nextInt();
		int gross = egg/144;
		egg %= 144;
		int dozen = egg/12;
		egg %= 12;
		System.out.println("Your number of eggs is " +gross+ " gross, " +dozen+ " dozen, and " + egg);
		
		sc.close();

	}

}
