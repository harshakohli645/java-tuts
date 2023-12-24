package strings;

import java.util.Scanner;

public class Removespecial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(removespec(s));
		System.out.println(addition(s));
		
		}

	static String addition(String s) {
		String t=""; int m=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z'|| ch>='A' && ch<='Z')
			{
				t=t+ch;
			}
			else if(ch>='0'&& ch<='9')
			{
				m=m+ch-48;
			}
		}
		return t+m;
	}

	static String removespec(String s) {
		String t=""; String m="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z'|| ch>='A' && ch<='Z')
			{
				t=t+ch;
			}
			else if(ch>='0'&& ch<='9')
			{
				m=m+ch;
			}
		}
		return t+m;
	}
}
