package strings;

import java.util.Scanner;

public class UpperToLower 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(UppertoLower(s));
		System.out.println(orderWise(s));
	}

	 static String orderWise(String s) {
		char c[]=new char[s.length()];
		for(int i=0;i<c.length;i++) {
			c[i]=s.charAt(i);
			
		}
		String t="";
		for(int i=0;i<c.length-1;i++) {
			for(int j=0;j<c.length-1-i;j++) {
			
			     if(c[j]<=c[j+1])
			    {
				   char temp=c[j];
				   c[j]=c[j+1];
				   c[j+1]=temp;
			   }
			}
		}
		return new String(c);
	}

	static String UppertoLower(String s) {
		 String t="";
		 for(int i=0;i<s.length();i++)
		 {
			 char c=s.charAt(i);
			 if(c>='a'&&c<='z')
			 {
				 t=t+(char) (c-32);
			 }
			 else if(c>='A'&& c<='Z')
			 {
				 t=t+(char)(c+32);
			 }
		 }
		 return t;
	}
}
