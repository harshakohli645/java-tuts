package arrays;
import java.util.Scanner;

public class Lcm 
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the values:");
		int n=scan.nextInt();
		int m=scan.nextInt();
		//int a=scan.nextInt();
		int count=1;
		int lcm,i;
		
		for(i=2;i<=m;i++)
		{
			if(n%i==0&&m%i==0)
			{
				count=i;
			}
		}
		lcm=(n*m)/count;
		System.out.print("lcm of two numbers:"+lcm);
	}

}
