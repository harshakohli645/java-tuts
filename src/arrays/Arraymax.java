package arrays;
import java.util.*;
public class Arraymax 
{
	static int MaxArray(int[]n)
	{
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<n.length;i++)
		{
			sum=sum+n[i];
			if(n[i]>max)
			{
				max=n[i];
			}
		    if(n[i]<min)
			{
				min=n[i];
			}
		}
		return sum-max;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
	    System.out.print("enter the size :");
		int n=sc.nextInt();	
		
		int []a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int res=MaxArray(a);
		System.out.print(res);
	}

}
