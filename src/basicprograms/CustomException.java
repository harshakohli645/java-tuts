package basicprograms;

import java.util.Scanner;
class EnterPinWasWrong extends Exception{ 
	public String getMessage() {
		return "Pin was Wrong! Please Try Again !!!";
	}
}

class Mobile {
	private int Pass =1432;
	int p;
	public void enterPass(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile Pin");
		 p = sc.nextInt();
	}
	public void valid() throws EnterPinWasWrong
	{
		if(p==Pass)
		{
			System.out.println("Moblie was Unlocked");
			System.out.println("Enjoy With your Moblie!");
		}
		else {
			EnterPinWasWrong ep = new EnterPinWasWrong();
			System.out.println(ep.getMessage());
			throw ep;
		}
	}
	
}
class MobileCompany{
	
	void allow()  {
		Mobile m = new Mobile();
		try {
			m.enterPass();
			m.valid();
		} catch (EnterPinWasWrong e) {
			try {
				m.enterPass();
				m.valid();
			}
			catch(Exception e1)
			{
				try {
					m.enterPass();
					m.valid();
				}
				catch(Exception e3) {
					try {
						m.enterPass();
						m.valid();
					}
					catch(Exception e4 ){
						System.err.println("Please try  Again After 30 Sec !!");
						System.exit(0);
						
					}
				}
			}
		
		
	}
}




}


public class CustomException 
{
	public static void main(String[] args) 
	{
		MobileCompany mc = new MobileCompany();
		mc.allow();
	}


}
