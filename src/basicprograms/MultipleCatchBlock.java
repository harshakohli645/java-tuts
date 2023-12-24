package basicprograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("connection iss estb");
			System.out.println("enter the number");
			int a = sc.nextInt();
			System.out.println("enter demominator");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
			int m[]=new int[5];
			System.out.println("enter index");
			int index = sc.nextInt();
			System.out.println("enter the value");
			int l=sc.nextInt();
			m[index]=l;
			System.out.println(m[index]);
		}
		catch(InputMismatchException e)
		{
			System.out.println("invalid input");
		}
		catch(ArithmeticException a)
		{
			System.out.println("enter non zero element");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("enter correct index");
		}
		catch(Exception e)
		{
			System.out.println("something went wrong");		
		}
		System.out.println("connection terminated");
	}
	

}
