package multitread;

class Demo implements Runnable{

	@Override
	public void run() {
		
		ready();
		
	}
	void ready()
	
	{
		String name = Thread.currentThread().getName();
		synchronized(this) {
			try {
				System.out.println(name+"running ..");
				Thread.sleep(2000);
				System.out.println(name+"walking ..");
				Thread.sleep(2000);
				System.out.println(name+"sleeping ..");
				Thread.sleep(2000);
				
			}
			catch(Exception e)
			{
				System.out.println("thread failed");
			}
			
	}
	
}
}
public class Program4 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		Thread t3= new Thread(d);
		t1.setName("yaswama");
		t1.setName("harsha");
		t1.setName("hareesh");
		t1.start();
		t2.start();
		t3.start();
		
	}
}


