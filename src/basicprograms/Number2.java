package basicprograms;


public class Number2 {
	public static void main(String[] args) {
		int n=5;
		int c=1;
		int data=1;
		int m=0;
		for(int i=1;i<=n;i++) 
		{
			int count=0;
			int k=1;
			
			for(int j=1;j<=n;j++) 
			{
				if(j%2==1)
				{
					System.out.print(count*10+data+" ");
					count++;
				}
				else if(j%2==0)
				{
					System.out.print(10*k-m+" ");
					k++;
				
					
				}
			}
			System.out.println(" ");
			data++;
			m++;
			
		
			
		}
	}
}
