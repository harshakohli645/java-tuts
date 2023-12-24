package strings;

import java.util.Scanner;

public class CountSpecial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		System.out.println(special(s));
		System.out.println(numbers(s));
	}

	 static int special(String s) {

		 int count=0;
		 for(int i=0;i<s.length();i++)
		 {
			  if(!((s.charAt(i)>='a')&& (s.charAt(i)<='z')|| (s.charAt(i)>='A')&& (s.charAt(i)<='Z')||(s.charAt(i)>='0')&& (s.charAt(i)<='9')))
               {
				  count++;
               }

		 }
		 return count;
	}
	 static int numbers(String s)
	 {int count=0;
		for(int i=0;i<s.length();i++)
		{
			
		
		 if(s.charAt(i)>='0' && s.charAt(i)<='9')
		 {
			 count++;
		 }
		}
		return count;
	 }
}
