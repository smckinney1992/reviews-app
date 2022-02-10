package consdemo;

public class StringPractice {

	public static void main(String[] args) {
		String s = "The quick fox jumps over the lazy dog";
		//1
		System.out.println(s.charAt(12));
		//2
		System.out.println(s.contains("is"));
		//3
		System.out.println(s.concat("and killed it"));
		//4
		System.out.println(s.endsWith("dogs"));
		//5
		System.out.println(s.contentEquals("The quick brown fox jumps over the lazy Dog"));
		//6
		System.out.println(s.contentEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		//7
		System.out.println(s.length());
		//8
		System.out.println(s.matches("The quick brown fox jumps over the lazy Dog"));
		//9
		System.out.println(s.replace("The", "A"));
		//10
		System.out.println(s.substring(0, s.indexOf(" jumps")) + "-" + s.substring(s.indexOf("jumps")));
		//11
		System.out.println(s.substring(s.indexOf("fox"), s.indexOf("fox") + 3) + "-" + s.substring(s.indexOf("dog")));
		//12
		System.out.println(s.toLowerCase());
		//13
		System.out.println(s.toUpperCase());
		//14
		System.out.println(s.indexOf('a'));
		//15
		System.out.println(s.lastIndexOf('e'));

	}

}
