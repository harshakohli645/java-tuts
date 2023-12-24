package strings;

import java.util.Scanner;

public class Vowelscount 
{
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(count(s));
		System.out.println(consonents(s));
	}

	  static int consonents(String s) 
	  {
		  int count=0;
		 for(int i=0;i<s.length();i++)
			 
		 {
			 if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z'))
			 {
				 if(!(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u') 
					 ||(s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U' ))
			     {
					 
					count++;
			     }
			 }
			 
		 }
		 return count;
	  }

	static int count(String s) 
	 {
		 int count=0;
		 for(int i=0;i<s.length();i++)
		 {
			 if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z'))
			 {
				 if((s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u') 
					 ||(s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U' ))
			     {
					 
					count++;
			     }
			 }
		 }
		 return count;
		 
	 }
	 
}
