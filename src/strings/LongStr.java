package strings;

import java.util.Scanner;

public class LongStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		reverseword(s);
	}

	static void reverseword(String s) {
		String h="";
		int i=0;
		while(i<s.length())
		{
			int j=i;
			String t="";
			int m=0;
			
			while(j<s.length()-1)
			{
				if(s.charAt(j)!=' ' && s.charAt(j+1)==' ')
				{
					m=j;
					break;
				}
				else
				{ m=j;
					j++;
				}
			}
			int temp =m;
			int l=i;
			while(m>=l)
			{
				t=t+s.charAt(m);
				m--;
			}
			h=h+t+" ";
			i=temp;
			System.out.println(t);
		}
		
		
	}
}
