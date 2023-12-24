package oops;
class BankAccount
{
	private long Ac;
	private float Balance;
	
	public void setData(long Ac,float Balance)
	{
		this.Ac=Ac;
		this.Balance=Balance;
		
	}
	public long getAc()
	{
		return Ac;
	}
	public float getBalance()
	{
		return Balance;
	}
	
}

public class Encapsulation1 
{
	public static void main(String[] args) 
	{
		BankAccount b = new BankAccount();
		b.setData(31242200060120L, 737383.4f);
		System.out.println(b.getAc());
		
		
	}
}
