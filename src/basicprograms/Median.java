package basicprograms;

public class Median {
	public static void main(String[] args) {
		int a[][]= {{5,11,20,35,25},{1,2,3,4,6,},{13,15,16,19,21,}};
		int sum=0;
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			int m=a[i].length/2;
			sum=sum+a[i][m];
			k++;
		}
		System.out.println(sum/k);
		System.out.println(a[0].length+a[1].length+a[2].length);
		
	}

}
