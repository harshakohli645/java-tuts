package multitread;


class Family implements Runnable{

	
	@Override
	synchronized public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("num")==true)
		{
			num();
			
		}
		else {
			cha();
		}
		}
	void num()
	{
		try
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println(i);
						
				try {
					Thread.sleep(1000);
					
				} catch (InterruptedException e) {
				 System.out.println("thread is num ended");
				}
			}
				
		}
		catch(Exception s)
		{
			System.out.println("thread is terminated");
		}
	}
	
	 void cha()
	{
		for(int i=65;i<=75;i++)
		{
			char a=(char)i;
			System.out.println(a);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Program3 {
	public static void main(String[] args) {
		System.out.println("main Tread started");
		Family a=new Family();
		Thread t = new Thread(a);
		Thread t1 = new Thread(a);
		t.setName("num");
		t1.setName("char");
		
		try {
			
			t.start();	
			Thread.currentThread().interrupt();
		}
		catch(Exception e)
		{
			System.out.println("num thread is terminated");
		
		}
		t1.start();
		
		
		
			
		
		
			
		
		}
		
		
		
		
	}


