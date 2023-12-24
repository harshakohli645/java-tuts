package basicprograms;

import java.util.Scanner;

public class PerfectSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(sqrt(n))
		{
			System.out.println("is a perfect square:"+n);
		}
		else
		{
			System.out.println("not a is a perfect square:"+n);
			
		}
	}

	static boolean sqrt(int n) {
		for(int i=1;i<=n;i++)
		{
			if(i*i==n)
			{
				return true;
			}
		}
		return false;
	}
}
