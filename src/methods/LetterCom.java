package methods;

import java.util.Scanner;

public class LetterCom 
{
	static String []key= {" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		possibleWords(s,"");
	
		
	}

	 static void possibleWords(String s, String ans) {
		 if(s.length()==0)
		 {
			 System.out.println(ans);
			 return;
		
	     }
		 String k = key[s.charAt(0)-48];
		 for(int i=0;i<k.length();i++)
		 {
			 possibleWords(s.substring(1), ans+k.charAt(i));
		 }

	
	}

}
