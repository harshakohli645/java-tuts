package arrays;

import java.util.Scanner;

public class Petreson 
{
   public static void main(String[]args)
   {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt(); 
	   int res = peterson(n);
	   if(n==res)
	   {
		   System.out.println(n+" petroson: "+res);
	   }
	   else
		   System.out.println(n+" not petroson: "+res);
   }

   static int peterson(int n) 
   {
	   
	   
	   int sum1=0;
	for(int i=n;i>0;i=i/10)
	{
		int fact=1;
		int r=i%10;
		for(int j=1;j<=r;j++)
		{
			fact=fact*j;
			
		}
		sum1=sum1+fact;
		
	}
	return sum1;
	
		
   }
   
   
}
