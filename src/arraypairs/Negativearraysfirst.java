package arraypairs;

import java.util.Scanner;

public class Negativearraysfirst 
{
	public static void main(String[]args)
	{
		
	
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int a[]=new int[n];
	  for(int i=0;i<a.length;i++)
	  {
		  a[i]=sc.nextInt();
	  }
	  negative(a);
	  for(int i=0;i<a.length;i++)
	  {
		  System.err.print(a[i]+" ");
	  }
	}

	static void negative(int[] a) 
	{
		//for(int i=0;i<a.length;i++)
		//{  
			for(int k=0;k<a.length-1;k++)
			{
			
			  for(int j=0;j<a.length-1;j++)
			  {
				if(a[j]==-1)
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
				
				
			  }
			 // System.out.print(a[k]+" ");
			//}
			//System.out.print(a[i]+" ");
		   
			
			
		}
		//System.out.print(false);
	}
}
