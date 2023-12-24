package oops;

import java.util.Scanner;

class Count extends Object
{
	private int id;
	private String name;
	
	private String email;
	public Count() 
	{
	}
	
	
	public Count(int id,String name ,String email)
	
	{
		this.id=id;
		this.name=name;
		this.email=email;
		
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	
	
	public String getname() {
		return name;
	}
	public void setemail(String email)
	{
		this.email=email;
	}
	public String getemail()
	{
		
		return email;
	}
	
	public String toString()
	{
	 return id+" "+name+" "+email;
	}
	 
}

public class Storing {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter n");
			int n=sc.nextInt();
			
			Count[]a=new Count[n];
			
			for(int i=0;i<a.length;i++)
			{
				int id=sc.nextInt();
				String name=sc.next();
				String email=sc.next();
				Count c=new Count(id,name ,email);
				a[i]=c;
				
			}
			/*for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i].getid()+" "+a[i].getname()+" "+a[i].getemail());
			}
			*/
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		}
}
