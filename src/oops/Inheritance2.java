package oops;

class Test extends Object{
	 private int x,y;
	public Test(){
		x=123;
		y=234;
		System.out.println(x);
		System.out.println(y);
	}
	Test(int x,int y){
		this.x=x;
		this.y=y;						//super() method is called to parent class by using contructer chaining
	}
}
class Test2 extends Test{
	private int a,b;
	public Test2(){
		a=345;
		b=456;
	}
	Test2(int a,int b){
		this.a=a;
		this.b=b;
	}

	 void display() {
		
	   System.out.println(a);
	   System.out.println(b);
	    
	}
}

public class Inheritance2 {
  public static void main(String[] args) {
	 Test2 t = new Test2();
	 t.display();
	 System.out.println(t.getClass());
	 System.out.println(t.toString());
	 
   }
}


