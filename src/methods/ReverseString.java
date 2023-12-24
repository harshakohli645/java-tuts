package methods;

import java.util.Scanner;

public class ReverseString 
{
		public static void main(String[] args) 
		{	
			Scanner sc = new Scanner(System.in);
			String s=sc.nextLine();
			//Reverse a = new Reverse();
			//System.out.println(a.reverse(s));
			Palindrome m = new Palindrome();
			if(m.palin(s)) 
			{
				System.out.println("palindrome");
				
			}
			else
			{
				System.out.println("not palidrome");
			}
			sc.close();
			
			
	   }
			
			
			
		

		
}
class Reverse
{
	String reverse(String s)
	{
		String t="";
		for(int i=s.length()-1;i>=0;i--)
		{
			t=t+s.charAt(i);
		}
		return t;
	}
}
class Palindrome
{
	boolean palin(String s)
	{
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			else
			{
				i++;
				j--;
			}
		}
		return true;
	}
}
