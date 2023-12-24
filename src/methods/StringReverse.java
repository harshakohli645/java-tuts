package methods;

import java.util.Scanner;


public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s=sc.nextLine();
		//split(s);
		int a=13;
		int b=a/2;
		//System.out.println(evenOdd(a));
		
		int c[]= {1,4,1,5,7,1,2,8,3,2,4};
		repeat(c);
	   
	}

	private static void repeat(int[] c) {
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					c[j]=0;
					System.out.print(c[i]+" ");
				}
			}
		}
		
		
	}

	private static int evenOdd(int a) {
		int b=a/2;
		  if(b*2==a)
		     {
		    	 System.out.println("even");
		     }
		     else {
		    	 System.out.println("odd ");
		     }	
		  return b;
	}

	private static int gcd(int a, int b) 
	{
		if(a>b)
		{
			for(int i=b;i>=1;i--) {
				if(a%i==0 && b%i==0)
				{
					return i;
				}
			}
		}
		else {
			for(int i=a;i>=1;i--)
			{
				if(a%i==0 && b%i==0)
				{
					
					return i;
				}
			}
		}
		return -1;
	}

	private static void split(String s) {
	    String p[]=s.split(" ");
	    for(int i=0;i<p.length-1;i=i+2)
	    {
	    	System.out.print(p[i+1]+" "+p[i]);
	    	}
		
	}

	private static void reverse(String s) {
		String t="";
			for(int i=s.length()-1;i>=0;i++)
			{
				t=t+s.charAt(i);
			}
		    
		
	}

}
