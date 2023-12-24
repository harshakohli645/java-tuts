package arrays;
import java.util.Scanner;
public class Arraypalindrome 
{  
   static int palindrome(int a)
	{   
	    
		int d=0;
        int rev=0;
		for(int i=a;i>0;i=i/10)
		{
			d=i%10;
			rev=rev*10+d;
			
		}
		return rev;
		
			
	}
	/*static boolean check(int m)
	{
		if(m==rev)
		{
			
				return true;
	    }
		else
		{
				return false;
		}
		
	}*/
	
	static void fun(int a)
	{
		for(int  i=a;i<=200;i++)
		{
			if(palindrome(i)==i)
			{
				System.out.print(i +" ");
			}
		}
	}
	
	
	
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		fun(a);
	}

}