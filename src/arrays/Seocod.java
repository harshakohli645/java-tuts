package arrays;

import java.util.Scanner;

public class Seocod 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("min    :"+(firstmin(a)+secondmin(a)));
		System.out.println("max    :"+(secondlarge(a)+firstlarge(a)));
		//System.out.println("max    :"+firstlarge(a));
	    System.out.println("maxprod:"+((firstmin(a))*(secondmin(a))));
		System.out.println("minprod:"+((firstlarge(a))*(secondlarge(a))));
		}
	static int firstmin(int[]a) 
	 {
		
		int se=a[0];
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				se=min;
				min=a[i];
			}
			else if(a[i]<se&&a[i]!=min)
				se=a[i];	
		}
		return min;	
	}
	 static int secondmin(int[]a)
	 {
		 int se=a[0];
			int min=Integer.MAX_VALUE;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]<min)
				{
					se=min;
					min=a[i];
				}
				else if(a[i]<se&&a[i]!=min)
					se=a[i];
			}
			return se;
	 }
	 static int secondlarge(int[]a)
	 {
		 int se=Integer.MIN_VALUE;;
			int max=Integer.MIN_VALUE;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]>max)
				{
					se=max;
					max=a[i];
				}
				else if(a[i]<se&&a[i]!=max)
					se=a[i];
			}
			
			return se;
	 }
	 static int firstlarge(int[]a)
	 {
		 int se=a[0];
			int max=Integer.MIN_VALUE;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]>max)
				{
					se=max;
					max=a[i];
				}
				else if(a[i]<se&&a[i]!=max)
					se=a[i];
		    }
			return max;
	 }
}
