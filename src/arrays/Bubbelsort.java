package arrays;

import java.util.Scanner;

public class Bubbelsort 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size:");
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println();
		sortedarray(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	static void sortedarray(int[]n)
	{
		for(int i=0;i<n.length-1;i++)
		{
			for(int j=0;j<n.length-1-i;j++)
			{
				if(n[j]>n[j+1])
				{
					int temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
		}
	}

}
