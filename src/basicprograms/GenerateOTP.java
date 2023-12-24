package basicprograms;

import java.util.Random;
import java.util.Scanner;

public class GenerateOTP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("enter Your mobile number");
		String mobile=sc.nextLine();
		String t="";
		System.out.print("OTP:");
		for(int i=1;i<=6;i++) {
			int m=r.nextInt(9);
			System.out.print(m+" ");
			t=t+m;
		}
			
		
		System.out.println();
		System.out.println("Enter the OTP:");
		
		
		String  verify = sc.nextLine();
	
		if(t.equals(verify)) {
			System.out.println("otp is successfully ");
		}
		else {
			System.out.println("otp is incorrect ");
		}
		sc.close();
		int f=Integer.parseInt(t);
		String s = Integer.toString(f);
		System.out.println(s);
		
	}

	
	

}
