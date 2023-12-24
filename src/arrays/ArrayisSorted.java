package arrays;

import java.util.Scanner;

public class ArrayisSorted {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of array");
	int n = sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
		
	}
	System.out.println(arraysort(a));
	}

	static boolean arraysort(int[] a) {
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				return false;
			}
		}
		return true;
	}

}
