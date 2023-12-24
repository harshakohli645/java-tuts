package oops;

class Customer{
	
	private int cId;
	private String cName;
	private long cNum;
	public Customer(int cId,String cName,long cNum) {
		
		this(cName,cNum);
		
	}
	public Customer()
	{
		cId=557;
		cName="hareess";;
	    cNum=8718371931l;
	}
	public Customer(String cName,long cNum) {
		
		this(cNum);
		this.cName=cName;
		
		
		
	}
	public Customer(long cNum) {
		this();
		this.cNum=cNum;
	}
	public int getcId()
	{
		return cId;
	}
	public String getcName() {
		return cName;
	}
	public long getcNum() {
		return cNum;
	}
}


public class Encapsulation2 {

		public static void main(String[] args) {
			Customer s = new Customer(892,"yassma",99516790l);
			
			System.out.println(s.getcId());
			System.out.println(s.getcName());
			System.out.println(s.getcNum());
		}	
}
