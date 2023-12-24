package strings;

import java.util.Scanner;

public class Trim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		System.out.println(trim(s));
	}

	 static String trim(String s) {
		 String t="";
		 int st=0,ed=0;
		 for(int i=0;i<s.length();i++)
		 {
			 char ch=s.charAt(i);
			 if(ch!=' ')
			 {
				 st=i;
				 break;
			 }
			 
		 }
		 for(int i=s.length()-1;i>=0;i--)
		 {
			 char ch=s.charAt(i);
			 if(ch!=' ')
			 {
				 ed=i;
				 break;
			 }
		 }
		 for(int i=st;i<=ed;i++)
		 {
			 t=t+s.charAt(i);
		 }
		 return t;
	}
}
