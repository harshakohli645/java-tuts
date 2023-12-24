package strings;

import java.util.Scanner;

public class IndexOf {
      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
    	  String s = sc.nextLine();
    	  char ch = sc.next().charAt(0);
    	  System.out.println(indexOf(s,ch));
     }

	 static int indexOf(String s,char ch) {
		 int count=0;
		 for(int i=0;i<s.length();i++)
		 {

			 char c=s.charAt(i);
			 if(c>='a' && c<='z' || c>='A' && c<='Z')
			 {
				 if(c==ch)
				 {
					 count++;
				 }
				 else if(count==2)
				 {
					 return i;
				 }
			 }
		 }
		 return -1;
	}
}
