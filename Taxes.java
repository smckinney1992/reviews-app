import java.util.Scanner;

public class Taxes {
	
	public static double maleTaxCalc(int income) {
			double mtax = 0;
		if(income >= 0 && income <= 180000) {
			mtax = income*0;
			System.out.println("No tax payable");
		} else if(income >= 180001 && income <= 500000) {
			mtax = income*.1;
			System.out.println("You owe $"+mtax);
		} else if(income >= 500001 && income <= 800000) {
			mtax = income*.2;
			System.out.println("You owe $"+mtax);
		} else if(income >= 800000) {
			mtax = income*.3;
			System.out.println("You owe $"+mtax);
		} else {
			
		}
		
		return mtax;
	}
	
	public static double femaleTaxCalc(int income) {
			double ftax = 0;
		if(income >= 0 && income <= 190000) {
			ftax = income*0;
			System.out.println("No tax payable");
		} else if(income >= 190001 && income <= 500000) {
			ftax = income*.1;
			System.out.println("You owe $"+ftax);
		} else if(income >= 500001 && income <= 800000) {
			ftax = income*.2;
			System.out.println("You owe $"+ftax);
		} else if(income >= 800000) {
			ftax = income*.3;
			System.out.println("You owe $"+ftax);
		} else {
			
		}
		return ftax;
	}

	public static void main(String[] args) {
		Scanner genderScan = new Scanner(System.in);
		Scanner incomeScan = new Scanner(System.in);
		System.out.println("Please enter your gender : ");
		String gender = genderScan.next();
		//System.out.println(gender);
		System.out.println("Please enter your income : ");
		int income = incomeScan.nextInt();
		if(gender.equals("female")) {
			Taxes.femaleTaxCalc(income);
		} else if(gender.equals("male")) {
			Taxes.maleTaxCalc(income);
		}
		//Taxes.femaleTaxCalc(ftax);
		//System.out.println("You owe $"+ftax);
		System.out.println("Thanks for using my tax calculator.");

	}

}
