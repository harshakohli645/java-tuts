package basicprograms;

import java.util.Scanner;

class Cars{
	int num;
	String Brand;
	int cost;
	Cars(int num,String Brand,int cost)
	{
		this.num=num;
		this.Brand=Brand;
		this.cost=cost;
		
	}
	public String toString() {
		return num+" "+Brand+" "+cost;
	}
	
	
} 

public class StoreDataInArray {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		
		int n = sc.nextInt();
		Cars []cr=new Cars[n];
		
		for (int i = 0; i < cr.length; i++) {
			int num=sc.nextInt();
			String  Brand=sc.next();
			int  cost=sc.nextInt();
			Cars c=new Cars(num,Brand,cost);
			cr[i]=c;
		}
		for (int i = 0; i < cr.length; i++) {
			System.out.print(cr[i]+" ");
		}
	
		
	}


}
