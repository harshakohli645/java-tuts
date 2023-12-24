package arrays;

import java.util.Scanner;

public class Sortedarray 
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		occurs(a);
	}

    static void occurs(int[] a) 
    {
    	int count=1;
    	int max=Integer.MIN_VALUE;
    	int max2=Integer.MIN_VALUE;
    	for(int i=0;i<a.length-1;i++)
    	{
    		if(a[i]==a[i+1])
    		{
    			count++;
    		}
    		else
    			
    		{
    			//count2=count;
    			if(count>max)
    			{
    				max=count;
    				max2=a[i];
    			   
    				
    			     // System.out.println(a[i]+" "+count)
    		     }
    			count=1;
    		}
    		
    	}
    	if(count>max)
    	{
    		max=count;
    		max2=a[a.length-1];
    		//System.out.println(a[a.length-1]+" "+count);
    	}
         
    	System.out.print("maximum times repeaating"+ max2+ " "+max);
    	
	}
	
}
