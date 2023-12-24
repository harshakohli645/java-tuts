package strings;

import java.util.Scanner;

class subst{
	static void substr(String s) {
		for(int i=s.length()-1;i>=0;i--)
		{
			for(int j=0;j<s.length()-i;j++)
			{
				String t="";
				String t2="";
				for(int k=j;k<=j+i;k++)
				{
					t=t+s.charAt(k);
				}
				for(int l=t.length()-1;l>=0;l--)
				{
					t2=t2+t.charAt(l);
				}
				if(t.equals(t2))
				{
				  System.out.println(t);
				  return;
				}
			}
		}
	}
}


public class SubMaxStringPalinDrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
	
		sc.close();
		subst.substr(s);
	}
	
}
