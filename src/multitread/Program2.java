package multitread;

import java.util.Scanner;

class Stall implements Runnable
{
	private String stallName;
	private String stallDetails;
	private double stallArea;
	private double stallCost ;
	private String owner;
	public Stall() {
	}
	public Stall(String  stallName ,String stallDetails,double stallArea,String owner) {
		this.stallName=stallName;
		this.stallDetails=stallDetails;
		this.stallArea=stallArea;
		this.owner=owner;
	}
	public double getStallArea() {
		return stallArea;
	}
	
	public String getOwner() {
		return owner;
	}
	public String getStallName()
	{
		return stallName;
	}
	public String getStallDetails()
	{
		return stallDetails;
		
	}
	public double getStallCost()
	{
		return stallCost;
	}
	
	public void run()
	{
		stallCost=stallArea*150;
	}
	
	
	
}
public class Program2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of stalls:");
		int n = sc.nextInt();
		sc.nextLine();
		Stall a[]=new Stall[n];
		for(int i=0;i<n;i++)
		{
			String s=sc.nextLine();
			String[] s1 = s.split(",");
			a[i] = new Stall(s1[0], s1[1],Integer.parseInt(s1[2]),s1[3]);
			
		}
		for(int i=0;i<n;i++)
		{
			Thread t = new Thread(a[i]);
			t.start();
			try {
				t.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		double totalCost=0.0;
		for(int i=0;i<n;i++)
		{
			totalCost+=a[i].getStallCost();
		}
		System.out.println(totalCost);
	}

}
