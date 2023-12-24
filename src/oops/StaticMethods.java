package oops;
class Methods{
	static int a=10;
	static String n;
	static
	{
		System.out.println("true");
	}
	static void name()
	{
		n="harsha";
		System.out.println(n);
	}
	int x,y;
	{
		System.out.println("instance block");
	}
	void fun1()
	{
		x=10;y=20;
		a=20;n="kohli";
		System.err.println(x +y+a+n);
	}
	public Methods ()
	{
		System.out.println("contructer excutiing");
		a=10;
		x=90;y=89;
		n="harsah";
		System.out.println(a+ x+y+n);
	}
}


public class StaticMethods {
	public static void main(String[] args){
		Methods.name();
		
		Methods c = new Methods();
		c.fun1();
		
	}
}

