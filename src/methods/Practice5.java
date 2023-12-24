package methods;


public class Practice5 {
	public static void main(String[] args) {
		int a[]= {3,5,9,2,1,8,0,2,3,1,0};
		int j=0;
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}
