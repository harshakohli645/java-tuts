package arrays;

import java.util.Scanner;

public class Atm 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int balance=200000;
		int pass=1234;
	    process(pass,balance);
	}
	static void process(int pass,int balance) 
	{
		Scanner sc = new Scanner(System.in);

			System.out.println("welcome to SBI ATM");
			System.out.println("please insert your card");
			System.out.println("enter your pin:");
			int n=sc.nextInt();
			while(pass==n) 
			{
				System.out.println("1: Withdrawals");
				System.out.println("2: Deposit");
				System.out.println("3: Balance");
				System.out.println("4: exist");
				System.out.println("choose your option:");
				
			
			int option=sc.nextInt();
			switch(option)
			{
			   case 1:
				   System.out.println("please enter withdrwal amount:");
				   int withdraw=sc.nextInt();
				   if(balance>=withdraw)
				   {
					   balance=balance-withdraw;
					   System.out.println("Please collect your cash:"+withdraw);
				   }
				   else
				   {
					   System.out.println("insufficent balance");
				   }
				   break;
			   case 2:
				   System.out.println("Please enter your deposit amount:");
				   int deposit=sc.nextInt();
				   balance=balance+deposit;
				   System.out.println("your deposit successfull");
				   System.out.println("balance:"+balance);
				    break;
			   case 3:
				   System.out.println("your balance:"+balance);
				   break;
			   case 4:
				   System.out.println("Thanks for visiting this ATM ");
			   	   System.exit(1);
			   	 
			   
				   
			
			}
		}
				
			   System.out.println("enter wrong pin try it again  ");
	}

			
			
	
}
