package arraypairs;

import java.util.Scanner;

public class Subarrays 
{
	public static void main(String[]args)
	{
		
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int [n];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	int m=sc.nextInt();
	int k=sc.nextInt();
	subarrays(a,m,k);
	}

	 static void subarrays(int[] a,int m,int k) 
	 {
		 int count=0;
		 for(int i=0;i<=a.length-m;i++)
		 {
			 int sum=0;
			 
			 for(int j=i;j<m+i;j++)
			 {
				sum+=a[j];
				System.out.print(a[j]+" ");
			
			 }
			 if(sum>count)
			 {
				 
			 }
			 //System.out.print(":"+sum);
			 System.out.println();
		 }
		 System.out.print(count);
		
	 }
}
