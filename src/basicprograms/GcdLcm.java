package basicprograms;

import java.util.Scanner;

public class GcdLcm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
	  System.out.println(gcd(a,b));
	  System.out.println(lcm(a,b));
	}

	  static int  lcm(int a, int b) {
		  return (a*b)/gcd(a,b);
	}

	static int gcd(int a, int b) {
		 while(a!=0  && b!=0)
		 {
			 if(a>b)
			 {
				 a=a%b;
			 }
			 else
			 {
				 b=b%a;
			 }
		 }
		 return a!=0 ?a:b;
	}
	 
	
	
}
