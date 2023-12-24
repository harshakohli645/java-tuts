package arrays;
import java.util.*;
public class Tables 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		table(n);
		
		
	}
	static void table(int a)
	{
		for(int j=1;j<=a;j++)
		{
		  int sum=1;
		  for(int i=1;i<=10;i++)
		  {	
			sum=j*i;
			System.out.println(j+"x"+i+"="+sum);
			//return sum;
		  }
		  
		 // return sum;
		}
		
	}
	
}
