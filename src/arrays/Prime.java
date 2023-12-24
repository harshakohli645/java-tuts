package arrays;
import java.util.*;

public class Prime 

{ static int temp=0;
	 static void check(int n)
	{
		int i;
		
		int count=0;
		for( i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.print(n+" ");
			temp++;
		    
			
		}
		
		
		
	}
	 static void loop(int n)
	{
		
		 for(int j=1;temp<n;j++)
		 {
	      check(j);
	       
		 }
	}

	
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the values:");
		//Prime b=new Prime();
		int a=scan.nextInt();
		loop(a);
		
		 
	}

}
