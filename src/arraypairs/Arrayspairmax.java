package arraypairs;

import java.util.Scanner;

public class Arrayspairmax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
		    a[i] = sc.nextInt();
		}
		pairmin(a);
		pairmax(a);
	}

	 static void pairmax(int[] a) 
	 {
		 int max=0;
			for(int i=0;i<a.length-1;i++) 
			{
				if(a[i]+a[i+1]>max)
				{
					max=a[i]+a[i+1];
					
				}
							
			}
			System.out.println("max pair:"+max);
			
	}

	static void pairmin(int[] a) 
	{
		int min=a[0]+a[0+1];
		for(int i=0;i<a.length-1;i++) 
		{
			if(a[i]+a[i+1]<min)
			{
				min=a[i]+a[i+1];
				
			}
						
		}
		System.out.println("min pair:"+min);
		
	}

}
