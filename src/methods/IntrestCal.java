package methods;

import java.util.Scanner;

public class IntrestCal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your amount");
		double amount = sc.nextInt();
		System.out.println("enter your time");
		double time=sc.nextDouble();
		time=time*12;
		System.out.println("enter intrest");
		double interst=sc.nextDouble();
		double finalamount=(amount*time*interst)/100;
		
		
		System.out.println(finalamount);
		int a=6;
		int b=4;
		System.out.println(a+" "+ b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+" "+ b);
		}

}
