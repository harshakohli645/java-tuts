package methods;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your nubers ");
		int a=sc.nextInt();
		//int b=sc.nextInt();
		//int seconds=sc.nextInt();
		//double hours=secondsToHours(seconds);
		//System.out.format("%.2f",hours);
		//System.out.println(secondsToHours(seconds));
		//System.out.println(53200/12);
		//System.out.println(gcd(a,b));
		//System.out.println(lcm(a,b));
		leap(a);
		//System.out.println(2000%4);
		
	}

	   static void leap(int a) {
		   if(a%4==0 )
		   {
			   System.out.println("its leap year");
		   }
		   else if(a%400==0)
		   {
			   System.out.println("its s leap year");
		   }
		   else
		   {
			   System.out.println("its is not leap year");
		   }

	   }

	static int lcm(int a, int b) {
		
		  int lcm=a*b/gcd(a,b);
		  return lcm;
		
	}

	static int gcd(int a, int b) {
		 int gcd=0;
		 if(a>b)
		 {
			 for(int i=1;i<=a;i++)
			 {
				if(a%i==0 && b%i==0) 
				{
					gcd=i;
				}
			 }
		 }
		 else
		 {
			 for(int i=1;i<=b;i++)
			 {
				 if(b%i==0 && a%i==0)
				 {
					 gcd=i;
				 }
			 }
		 }
		 return gcd;
		
	}

	static String secondsToHours(int seconds) {
		 int sec;
		 int hours;
		 int mins;
		 if(seconds>43200) {
			 sec=seconds/12;
			 sec=sec/60;
			 hours=sec/60;
			 mins=sec%60;
			 return hours+":"+mins;
			 
		 }
		 else {
			 
			  sec=seconds/60;
			  hours=sec/60;
			   mins=sec%60;
			   return   hours+":"+mins ;
		 }
		 
		 
		 
		
	}

}
