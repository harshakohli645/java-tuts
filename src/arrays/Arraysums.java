package arrays;
import java.util.*;
public class Arraysums 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		int []temp=new int[a.length];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();			
		}
		for(int i=0;i<a.length;i++) 
		{
			int sum=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]!=a[j])
				{
					sum=sum+a[j];
				}
			}
			
		
		   for(int k=i;k<=i;k++)
		    	
		    {
		    	temp[i]=sum;
		    }
		
		}
		for(int i=0;i<temp.length;i++)
		{
			System.out.print(temp[i]+" ");
		}
		System.out.println();
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]>max)
			{
				max=temp[i];
			}
		 
		}
		System.out.println("max:"+max);
		int min=Integer.MAX_VALUE;
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]<min)
			{
				min=temp[i];
			}
		}
		System.out.println("min:"+ min);
	}

}
