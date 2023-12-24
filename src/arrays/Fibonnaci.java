package arrays;
import java.util.Scanner;
public class Fibonnaci 
{
	 static void fib(int n)
	{
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=n;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
		System.out.println();
	}
	 
	 
   static void alphabet(char n)
    {
    	for(int i=1;i<=5;i++)
    	{
    		for(int j=1;j<=5;j++)
    		{
    			System.out.print(n+" ");
    			n++;
    		}
    		System.out.println();
    	}
    }
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the valu:");
		int h=sc.nextInt();
		System.out.print("enter the charater:");
		char m=sc.next().charAt(0);
		fib(h);
		alphabet(m);
	}

}
