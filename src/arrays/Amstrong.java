package arrays;
import java.util.*;
public class Amstrong 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("enter the value:");
		int m=sc.nextInt();
		int res=amstrong(m);
		
			
			System.out.println("amstrong "+res);
		
	}
	 static int amstrong(int n)
	{
		 int sum=0;
		 int r=0;
		 for(int i=n;i>0;i=i/10)
		 {
			 r=i%10;
			 sum=sum+(int)Math.pow(r,numbers(n));
		 }
		 return sum;
		
	}
	static int numbers(int n)
	{
		int count=0;
		for(int i=n;i>0;i=i/10)
		{
			int r=i%10;
			count++;
			
		}
		return count;
	}

}
