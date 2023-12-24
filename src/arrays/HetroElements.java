package arrays;

import java.util.Scanner;

public class HetroElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		
		Object a[]=new Object[n];
		a[0]="harsha0";
		a[1]=1;
		a[2]=true;
		a[3]='a';
		a[4]=2.3f;
		a[5]=4383.48820;
	
		a[6]=93810291L;
		a[8]=67;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
					
	}

}
