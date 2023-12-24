package strings;

import java.util.Scanner;

public class Upper 
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
	     String s = sc.nextLine();
	     
	     String t=uppercase(s);
	     System.out.println(t);
	    		 
	}

	static String uppercase(String s) 
	{	
		String t="";
		for(int i=0;i<s.length();i++)
		{
			
		  if(s.charAt(i)>='a' && s.charAt(i)<='z')
          {
			  t=t+(char)(s.charAt(i)-32);
          }
		  else
		  {
			  t=t+(char)(s.charAt(i)+32);
		  }

	     }
		return t;
	

	}
}
