package multitread;

import java.util.Scanner;

class Users extends Thread{
	String name;
	int age ;
	String gen;
	public void run()
	{
		Thread t = Thread.currentThread();
		String name = t.getName();
		if(name.equals("detail"))
		{
			details();
		}
		else
		{
			Numbers();
		}
		
		
	}
	public void details()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Details");
		System.out.println("enter Name");
		 name = sc.next();
		System.out.println("enter age");
		 age = sc.nextInt();
		System.out.println(" choose Gender");
		System.out.println(" 1.Men or 2.Women");
		System.out.println("enter Number for choose");
		int choose = sc.nextInt();
		if(choose==1)
		{
			 gen = "men";		
		}
		else if(choose==2)
		{
			gen = "women";
		}
		else {
			System.out.println("wrong entered please choose right one...!");
			System.exit(0);
		}	
		diplay();
	}
	public void diplay() {
		System.out.println("Any mistakes please check your details");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("gender:"+gen);
		
	}
	public void Numbers()
	{
		System.out.println("enters printing started");
		
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("numbers printin ended");
	}
	 
}





public class Program1 {
	public static void main(String[] args) {
		Users user = new Users();
		user.setName("detail");
		Users user2=new Users();
		user2.setDaemon(true);
		
		user2.setName("Num");
		user.start();
		user2.start();
		
		}
	

}
