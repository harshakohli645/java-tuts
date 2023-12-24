package arrays;
import java.util.Scanner;

public class Arrays2
{
	//int[]a;
	public static void main(String[]args)
	{	//int sum=0;
	
		int[]a=new int[5];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{	System.out.println("enter the value:");
			a[i]=scan.nextInt();
		}
		//System.out.println("the sum of values:");
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
	
		}
		System.out.println("the sum of values:"+sum);
	}
	
}
