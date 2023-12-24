package oops;


final class Cal//can,be inhertitae
{
	 final int a=100;//final varibable can be constent can't be change 
	final public void dipaly() {
		System.out.println(a);
		
	}
}
class Cal2{
	public void dipaly() {//final keyword method can'be oveeriden 
		
	}
}

public class FinalKeyword {
	public static void main(String[] args) {
		Cal c = new Cal();
		c.dipaly();
		
	}
}
