package patterns;

public class Numbers {
	public static void main(String[] args) {
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++) 
		{
			int k=count+n-1;
			for(int j=1;j<=n;j++) 
			{
				if(i%2==1) 
				{
					System.out.print(count+" ");
					count++;
				}
				else if(i%2==0) {
					System.out.print(k+" ");
					k--;
					count++;
					
				}
			}
			System.out.println();
		}
	}
}
