package methods;

import java.awt.image.AreaAveragingScaleFilter;

public class Practice8 {
		public static void main(String[] args) 
		{
		  //int a[]= {-2,-1,-3,4,-1, 2,1,-5,4};
		  int a[]= {1,2,3,4,5,6};
		  
			
			//maxSubArray(a);
			String s="hELLO WoRLd";
			//toUpper(s);
			System.out.println(up(s));
			//System.out.println(evenSum(a));
			
		}
		

		private static int evenSum(int[] a) {
		   int sum=0;
		   for(int i=0;i<a.length;i++)
		   {
			   if(a[i]%2==0)
			   {
				   sum=sum+a[i];
			   }
		   }
		   return sum;
			
		}


		private static String up(String s) {
			String t="";
			for(int i=0;i<s.length();i++)
			{
				
			  if(s.charAt(i)>='a' && s.charAt(i)<='z')
	          {
				  t=t+(char)(s.charAt(i)-32);
	          }
			  else if(s.charAt(i)>'A'&& s.charAt(i)<'Z')
			  {
				  t=t+(char)(s.charAt(i)+32);
			  }
			  else {
				  t=t+s.charAt(i);
			  }

		     }
			return t;			
		}


		private static void toUpper(String s) {
			String t="";
			for(int i=0;i<s.length();i++)
			{
				
				if(s.charAt(i)>'a' && s.charAt(i)<'z') {
					t=t+(char)(s.charAt(i)-32);
				}
				else {	
					
					t=t+(char)(s.charAt(i)+32);
					
				}
			}
			System.out.println(t);
			
		}

		private static void maxSubArray(int[] a) {
			int max=Integer.MIN_VALUE;
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<=a.length-i;j++)
				{
					  int sum=0;
						for(int m=j;m<i+j;m++)
						{
							sum=sum+a[m];
						}
						if(sum>max)
						{
							max=sum;
						}
				}
					
			}
			System.out.println(max);
				
			
		}
}

		
			