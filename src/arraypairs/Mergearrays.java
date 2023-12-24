package arraypairs;

import java.util.Scanner;

public class Mergearrays 
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner (System.in);
	System.out.println("enter size:");
	int n=sc.nextInt();
	int ar[]=new int[n];
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
	System.out.println("enter size:");
	int m=sc.nextInt();
	int ar2[]=new int[m];
	for(int i=0;i<ar2.length;i++)
	{
		ar2[i]=sc.nextInt();
	}
	System.out.println("enter size:");
	int l=sc.nextInt();
	int ar3[]=new int[l];
	for(int i=0;i<ar3.length;i++)
	{
		ar3[i]=sc.nextInt();
	}
	int result[]=mergearrays(ar,ar2,ar3);
	for(int i=0;i<result.length;i++)
	{
		System.out.print(result[i]+" ");
	}
	System.out.println();
    mergesorted(result);
}

	
	
    static int[] mergearrays(int[]ar,int[]ar2,int[]ar3)
    {
    	int i=0,k=0;
    	int res[]=new int[ar.length+ar2.length+ar3.length];
    	while(k<res.length)
    	{
    		if(i<ar.length)
    		{
    			res[k++]=ar[i];
    		}
    		if(i<ar2.length)
    		{
    			res[k++]=ar2[i];
    		}
    		if(i<ar3.length)
    		{
    			res[k++]=ar3[i];
    			
    		}
    		i++;
    	}
    	return res;

	

    }
    
   static void mergesorted(int []a)
   {
	   int n[]=new int[a.length];
	   for(int i=0;i<a.length;i++)
	   {
		   for(int j=i+1;j<a.length;j++)
			   
		   {
			   if(a[i]>a[j])
			   {
				   int t=a[i];
				   a[i]=a[j];
				   a[j]=t;
				   
			   }
		   }
		   System.out.print(a[i]+" ");
	   }
				   
   }
	
	
	
	
	
	
}
