package methods;
import java.util.Scanner;

class Solution {
    public Character firstChar(String input) {
       String s=input;
       char a=s.charAt(0);
       for(int i=0;i<s.length();i++)
       {
           char c=s.charAt(i);
           return  c;
       }
       return a ;
       
    }
}

// The code below was automatically added to handle input/output operations
class FirstCharDriver {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        scanner.close();

        Solution sol = new Solution();
        System.out.print(Character.toString(sol.firstChar(myString)));
    }
}