package arraypairs;

import java.util.Scanner;

public class Mergesortedarrays 
{
	public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int []a=new int[n];
	 for(int i=0;i<a.length;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 int m=sc.nextInt();
	 int b[]=new int [m];
	 for(int i=0;i<b.length;i++)
	 {
		 b[i]=sc.nextInt();
	 }
	 int res[]=mergearrays(a,b);
	 for(int i=res.length-1;i>=0;i--)
	 {
		System.out.print(res[i]+" ");
	 }
	 System.out.println();
	 for(int i=0;i<res.length;i++)
	 {
		System.out.print(res[i]+" ");
	 }
	 
	}

	static int[] mergearrays(int[] a, int[] b) {
		int i=0,j=0,k=0;
		int []res=new int[a.length+b.length];
		while(i<a.length && j<b.length)
		{
			if(a[i]>b[j])
			{
				res[k++]=b[j++];
			
		    }
			else
			{
				res[k++]=a[i++];
				
			}

		}
		while(i<a.length)
		{
			res[k++]=a[i++];
		}
		while(j<b.length)
		{
			res[k++]=b[j++];
		}
        return res;
	

	
	}
}
