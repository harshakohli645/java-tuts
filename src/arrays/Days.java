package arrays;
import java.util.Scanner;
public class Days
{
	static void prime(int n)
	{
		int i;
		int count=0;
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.print(n);
		}
	}
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		
		 prime(a);
				
		
	}
}
