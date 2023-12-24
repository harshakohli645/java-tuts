package arraypairs;

import java.util.Scanner;

public class Allsubarrays 
{
	public static void main(String[]args)
	{
		
	
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the size:");
	  int n=sc.nextInt();
	  int a[]=new int[n];
	  for(int i=0;i<a.length;i++)
	  {
		a[i]=sc.nextInt();
	  }
	  int k=sc.nextInt();
	  subarrays(a,k);
				
	}

	 static void subarrays(int[] a,int n)
	 {
		 //int count=0;
	  for(int k=a.length-1;k>=0;k--) 
	  {	 
		 for(int i=0;i<a.length-k;i++)
		 {
			 int sum=0;
			 for(int j=i;j<=i+k;j++)
			 {
				 sum+=a[j];
				 //System.out.print(a[j]+" ");
				 
			 }
			 if(sum==n)
			 {
				 for(int j=i;j<=i+k;j++)
				 {
					 //sum+=a[j];
					 System.out.print(a[j]+" ");
					 
				 }
				 return;
				 //System.out.println();
			 }
			 
			 
		 }
		

	  }
		
	}

}
