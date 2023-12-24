package basicprograms;

import java.util.Scanner;

public class UserExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte m=10;
		m*=100;
		System.out.println(m);
		try
		{
			System.out.println("enter the number");
			int a=sc.nextInt();
			System.out.println("enter the number");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("enter correct inputs");
		}
		
	}
}
