package arrays;
import java.util.*;
public class Automophic 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		auto(n);
		//counts(n);
	}
			
	static void auto(int m)
	{
		int s=m*m;
		
	
		if(counts(m)==2 )
		{
			int r=s%100;
			if(m==r)
			{
			  System.out.print(s +" automophic:"+r);
			}
			else
				System.out.print(s+ " not automophic:"+ r);
			
		}
		
		else if(counts(m)==3)
		{
			int r=s%1000;
			if(m==r)
			{
			System.out.print(s +" automophic:"+ r);
			}
			else
				System.out.print(s+"not automophic:"+r);
		}
		else if(counts(m)==4)
		{
			int r=s%10000;
			if(m==r)
			{
			System.out.print(s +" automophic:"+ r);
			}
			else
				System.out.print(s+"not automophic:"+r);
			
		}
		
	}
	static int counts(int a)
	{
		int count=0;
		int r=0;
		for(int i=a;i>0;i=i/10)
		{
			r=i%10;
			count++;
		}
		return count;
	}

}
