package methods;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		
		
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number");
			int n = sc.nextInt();
			System.out.println(binary(n));
			System.out.println("enter binary number");
			String m=sc.next();
			System.out.println(decimal(m));
			//System.out.println(Math.pow(2, 0));
			int c=0x45;
			System.err.println(c);
			
			
		
		
	}

	static double decimal(String n) {

		double a=0;
		double c=0;
		int m=Integer.parseInt(n);
		while(m>0) {
			int r=m%10;
			if(r==1)
			{
				a=a+Math.pow(2, c);
				c++;
			}
			else {
				c++;
			}
			m=m/10;
		}
		return a;
	}

	static String binary(int n) {
		String t="";
		while(n>0)
		{
			int r=n%2;
			t=r+t;
			n=n/2;
		}
		return t;
		
	}

}
