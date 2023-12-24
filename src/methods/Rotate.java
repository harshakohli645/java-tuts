package methods;

public class Rotate {
	public static void main(String[] args) {
		int a[]= {-1,-100,3,99};
		for(int i=0;i<a.length;i++)
			
		{
			System.out.print(a[i]+",");
		}
		rotaate(a,2);
		
		
		System.out.println();
		for(int i=0;i<a.length;i++)
			
		{
			System.out.print(a[i]+",");
		}
	}

	  static void roat(int[] a) {
		  int t=a[a.length-1];
		  for(int i=a.length-2;i>=0;i--)
		  {
			  a[i+1]=a[i];
		  }
		  a[0]=t;
		
		
	}

	static void rotaate(int[] a, int k) {
		  k=k%a.length;
		  if(k<0)
		  {
			  k=k+a.length;
		  }
		  //reverse(a,0,k-1);
		  //reverse(a,k,a.length-1);
		  //reverse(a,0,a.length-1);
		  roat(a);
		  roat(a);
		  roat(a);
		  
		  
		  
		  
		  
		
	}

	static void reverse(int[] a,int s,int e) {
		
		 
		 for(int i=s;i<=e/2;i++)
		 {
			 int temp=a[i];
			 a[i]=a[e];
			 a[e--]=temp;
			 
		 }
		
	}

}
