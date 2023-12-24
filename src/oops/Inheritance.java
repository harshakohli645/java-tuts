package oops;


class Human{
	String name="sairam";
	int bal=350000;
}
class Sun extends Human
{
	void ChangeData() {
		name="harsha";
		bal=500000;
	}
	void display() {
		System.out.println(name);
		System.out.println(bal);
	}
}
class Inheritance{
	 public static void main(String[] args) {
		Sun s = new Sun();
		s.display();
	   
	   s.ChangeData();
	   s.display();
	   
	    
	}
 }



















