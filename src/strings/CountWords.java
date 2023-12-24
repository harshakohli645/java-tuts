package strings;

import java.util.Scanner;

public class CountWords 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(countspace(s));
		System.out.println(countwords(s));
		
	}

	  static int countwords(String s) 
	  {
		  int count=0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		return s.charAt(0)==' '? count :count+1;
	}

	static int countspace(String s) {

		 int count=0;
		 for(int i=0;i<s.length();i++)
		 {
			 if(s.charAt(i)==' ' )
			 {
				 count++;
			 }
		 }
		 return count;
	}
}
