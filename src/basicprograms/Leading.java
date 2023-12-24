package basicprograms;

import java.util.Scanner;

public class Leading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt();
		int a[]=new int[s];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();		
		}
		leading(a);
	}

	static void leading(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					
				}
				else {
					break;
				}
				System.out.println(a[j]+" ");
			}
		}
		System.out.println(a[a.length-1]);
	}
	
}
