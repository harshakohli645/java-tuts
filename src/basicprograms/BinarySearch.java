package basicprograms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		byte key=sc.nextByte();
		Arrays.sort(a);
			
		System.out.println(binarysearch(a,key));
		sc.close();
	   
	}

	 static int binarysearch(int[] a, byte key) {
		int l=0,h=a.length-1;
		int mid=0;
		while(l<=h)
		{
			mid=l+h/2;
			if(key==a[mid])
			{
				return mid;
			}
			else if(key<a[mid])
			{
				h=mid-1;
				
			}
			else
			{
				l=mid+1;
			}
		}
		return -1;
	}
}
