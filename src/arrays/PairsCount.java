package arrays;

import java.util.Scanner;

public class PairsCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		pairs(a);
	}

	static void pairs(int[] a) {
		int p=0;
		int m=1234;
		for(int i=0;i<a.length;i++)
		{
			int c=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
					a[j]=m;
				}
			}
			if(a[i]!=m) {
				
			
			if(c>1)
			{
				p=p+c/2;
			}
			}
			
			
		}
		System.out.println(p+"pairs");
	}

}
