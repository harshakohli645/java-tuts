package arraypairs;

import java.util.Scanner;

public class Longestsubarray 
{
	public static void main(String[]args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("enter the size:");
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<a.length;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	  
		consecutivearrays(a);
		//countarrays(a);
		//maxcountarrays(a);
	    //maxelements(a);
	}

	
	
	
	
	
	
	
	 static void consecutivearrays(int[]a) 
	 {
		 for(int i=0;i<a.length-1;i++)
		 {
			 if(a[i]+1==a[i+1])
			 {
				 System.out.print(a[i]+" ");
			 }
			 else
			 {
				 System.out.println(a[i]+" ");
				 
			 }
		 }
		 System.out.println(a[a.length-1]);
		 
	}
	 static void countarrays(int[]a)
	 {
		 int count=1;
		 for(int i=0;i<a.length-1;i++)
		 {
			 if(a[i]+1==a[i+1])
			 {
				 count++;
			 }
			 else
			 {
				 System.out.println(count+" ");
				 count=1;
			 }
		 }
		 System.out.println(count);
		 
	 }
	 
	 
	 
	 static int maxcountarrays(int[]a)
	 {
		 int count=1;int max=Integer.MIN_VALUE;
		 for(int i=0;i<a.length-1;i++) 
		 {
			 if(a[i]+1==a[i+1]) 
			 {
				 count++;
			 }
			 else
			 {
				 if(count>max)
				 {
					 max=count;
				 }
				 count=1;
			 }
		 }
		 if(count>max)
		 {
			 max=count;
		 }
		return max;
		 
	 }
	 static void maxelements(int a[])
	 {
		 int count=1;
		 int max1=maxcountarrays(a);
		 int max=0;
		 for(int i=0;i<a.length-1;i++) 
		 {
			 if(a[i]+1==a[i+1])
			 {
				 count++;
				 
			 }
			 else
			 {
				 if(count>max)
				 {
					 max=count;
					 
				 }
				 count=1;
			 }
			 if(max==max1)
			 {
				 for(int j=i;j<a.length-1;j++)
				 {
					 if(a[j]+1==a[j+1])
					 {
						 System.out.print(a[i]+" ");
					 }
								 
				 }
				 //System.out.print(a[i]+" ");
			 }
			 //count=1;
			 
		 }	 
	}
}
