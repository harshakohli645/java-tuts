package arrays;

public class InverseOfArray {
	public static void main(String[] args) {
		int a[]= {2,3,1,0,4};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int b[]=inverse(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

	 static int [] inverse(int[] a) {
		 int b[]=new int[a.length];
		 for(int i=0;i<a.length;i++)
		 {
			 b[a[i]]=i;
		 }
		 return b;
	}

}
