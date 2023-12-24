package methods;
class Multiplictaions
{
	 int mul(int a,int b)
	{
		int pro=a*b;
		return pro;
	}
	 int mul(int a,int b,int c)
	 {
		 int pro=a*b*c;
		 return pro;
	 }
	  float mul(float a,float b)
	  {
		  float pro=a*b;
		  return pro;
	  }
	  double mul(double a,double b)
	  {
		  double pro=a*b;
		  return pro;
	  }
	  float mul(int a,float b,int c)
	  {
		  float pro=a*b*c;
		  return pro;
	  }
	  double mul(double a,float b,double c)
	  {
		 double pro=a*b*c;
		 return pro;
	  }
	
}
 class Additions
{
	  int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	float add(int a,float b)
	{
		float sum=a+b;
		return sum;
	}
}

































public class Overload 
{
	public static void main(String[] args) 
	{
		Multiplictaions	s=new Multiplictaions();
		System.out.println(s.mul(20, 20,10));
		System.out.println(s.mul(10, 20.2f,20));
		System.out.printf("%.2f",s.mul(2.22, 20.2f,20.2));
		System.out.println('c');
		System.out.println(22.f);
	    Additions a=new Additions();
	    System.out.println(a.add(20,30));
	  
		
	}
}
