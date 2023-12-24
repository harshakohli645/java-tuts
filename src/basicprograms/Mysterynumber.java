package basicprograms;

import java.util.Scanner;

public class Mysterynumber 
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
     mystery(n);
	}
     
	static int revere(int n)
	{
		//int re=n/2;
		int rev=0;
		int tem=n;
		
		while(n>0) 
		{
			int i=n%10;
			rev=rev*10+i;
		    n=n/10;
		}
		return rev;
	 }
	static void mystery(int m)
	{
		for(int i=1;i<=m/2;i++)
		{
			int re=revere(i);
			if(i+re==m)
			{
				System.out.println("its a mystery number:"+i+" "+re +"sum :"+(i+re));
			    break;
			}
			
		}
		System.out.println("its not a mystery number:");
		
	}
}
	
	

