package basicprograms;

import java.util.Scanner;

public class MatrixSortedSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n[][]= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24}};
		int t = sc.nextInt();
		if(checkNumber(n,t))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
	}

	static boolean checkNumber(int[][] n, int t) {
		int i=0,j=n[0].length-1;
		while(i<n.length && j>=0){
			if(n[i][j]==t)
			{
				
				return true;
			}
			else if(t<n[i][j])
			{
				j--;
			}
			else
			{
				i++;
			}
		
		}
		return false;
	}
}
