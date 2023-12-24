package strings;

import java.util.Scanner;

public class Findchar 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		System.out.print(s);
		char  a='h';
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(a==s.charAt(i))
			{
				count++;
			}
		}
		System.out.print(count+" "+a);
		System.out.print(s.lastIndexOf('h'));

		
	}

}
