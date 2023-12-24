package patterns;

public class Butterfly {
	public static void main(String[] args) {
		int a=5;
		butterfly(a);
		
	}

	 static void butterfly(int a) 
	{
		 for(int i=1;i<=a*2-1;i++)
		 {
			 for(int j=1;j<=a*2-1;j++)
			 {
				 if((i>=j&&i<=a)|| (i<=a && i+j>=a*2)||(i>a && i+j<=a*2) || i>a && j>=i)
				 {
					 System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 System.out.println();
		 }
		
	}

}
