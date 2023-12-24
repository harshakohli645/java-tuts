package arraypairs;

import java.util.Scanner;

public class Arraypair {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		arraypairselements(a);
		sc.close();
	}

	static void arraypairselements(int[] n) 
	{
		for(int i=0;i<n.length-1;i++)
		{
			for(int j=i+1;j<n.length;j++) 
			{
				//if(n[i]+n[j]==5)//pair elements is 5
				{
				System.out.println(n[i]+" "+n[j]);
				}
			}
		}
		
		
	}

}
