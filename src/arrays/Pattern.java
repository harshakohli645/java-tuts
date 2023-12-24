package arrays;

public class Pattern {
	public static void main(String[]args)
	{
		int i,j;
		int n=5;
		for(i=1;i<=n;i++) 
		{
			for(j=1;j<=n;j++)
			{
				if(j==1||j==5|i==3)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print("  ");
				}
			
			   //System.out.println();
			}
			System.out.println();

			/*for(j=1;j<=n;j++)
			{
				if(i==1 ||i==5)
				{
					System.out.print("*"+" ");
				
				}
				else
				{
					System.out.print("  ");
				}
			
			  System.out.println();
			}*/
		}
		System.out.println("--------");
		for(i=1;i<=n;i++)
		{
		for(j=1;j<=n;j++)
		{
			if(j==1||j==5|i==3)
			{
				System.out.print("*"+" ");
			}
			else
			{
				System.out.print("  ");
			}
		
		   //System.out.println();
		}
		System.out.println();
		}
		

	}

}
