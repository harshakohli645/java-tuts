package arrays;

public class NamePattern 
{
	    public static void main(String[]args)
	    {
	        int a=5;
	        int i,j;
	        for(i=1;i<=a;i++)
	        {
	            for(j=1;j<=a;j++)
	            {
	                if(j==1||i==3||j==a)
	                {
	                    System.out.print("*"+" ");
	                }
	                else
	                {
	                    System.out.print("  ");
	                }
	                System.out.print("");
	                
	                
	            }
	            System.out.print(" ");
	            for(j=1;j<=a*2-1;j++)
	            {
	                if((i+j==6||j-i==4)||(i==3&&j>=3&&j<=7&&j!=4&&j!=6))
	                {
	                    System.out.print("*");
	                 }
	                else
	                {
	                    System.out.print(" ");
	                }

	            }
	            System.out.print("  ");
	            for(j=1;j<=a;j++)
	            {
	                if(j==1 || i==1&&j>=2&&j<a||i==2&&i+j==7||i==3&&j>=1&&j<a||i==4&&i+j==8||i==5&&i+j==10)
	                {
	                    System.out.print("*"+" ");
	                }
	                else{
	                    System.out.print("  ");
	                }
	            }
	            System.out.print(" ");
	            for(j=1;j<=a;j++)
	            {
	            	if(i==1&&j>=2&&j<=a || i==2&&j<=1||i==3&&j>=2&&j<=4||i==4&&j>=a||i==5&&j>=1&&j<=a-1)
	            	{
	            		System.out.print("*"+" ");
	            		
	            	}
	            	else
	            	{
	            		System.out.print("  ");
	            	}
	            }
	            System.out.print(" ");
	           
	            for(j=1;j<=a;j++)
	            {
	                if(j==1||i==3||j==a)
	                {

	                	System.out.print("*"+" ");
	                }
	                else
	                {
	                    System.out.print("  ");
	                }
	                System.out.print("");
	                
	                
	            }
	            System.out.print(" ");
	            for(j=1;j<=a*2-1;j++)
	            {
	                if((i+j==6||j-i==4)||(i==3&&j>=3&&j<=7&&j!=4&&j!=6))
	                {
	                    System.out.print("*");
	                }
	                else
	                {
	                    System.out.print(" ");
	                }

	            }
	            System.out.println();
	       }
	        System.out.println();
	        System.out.print("I ❤️ YOU"+"  "+"I ❤️ YOU"+"  "+"I ❤️ YOU"+"   "+"I ❤️ YOU"+" "+"I ❤️ YOU"+" "+"I ❤️ YOU"+" "+"I ❤️ YOU");
	        
	        System.out.println();
	        
	       for(i=1;i<=a;i++)
	       {
	        	for(j=1;j<=a;j++)
	        	{
	        		if(i==1&&j>=2&&j<=a || i==2&&j<=1||i==3&&j>=2&&j<=4||i==4&&j>=a||i==5&&j>=1&&j<=a-1)
	            	{
	            		System.out.print("*"+" ");
	            		
	            	}
	            	else
	            	{
	            		System.out.print("  ");
	            	}
	        		
	            }
	        	System.out.print("");
	        	
	        	for(j=1;j<=a*2-1;j++)
	            {
	                if((i+j==6||j-i==4)||(i==3&&j>=3&&j<=7&&j!=4&&j!=6))
	                {
	                    System.out.print("*");
	                 }
	                else
	                {
	                    System.out.print(" ");
	                }

	            }
	            System.out.print(" ");
	            for(j=1;j<=a;j++)
	            {
	            	if(j==1||i==j||j==a)
	            	{
	            		System.out.print("*"+" ");
	            	}
	            	else
	            	{
	            		System.out.print("  ");
	            	}
	            }
	            System.out.print(" ");
	            for(j=1;j<=a;j++)
	            {
	            	if(j==1||i==1&&j>=1&&j<a||j==5&&i!=1&&i!=a||i==5&&j<a)
	            	{
	            		System.out.print("*"+" ");
	            	}
	            	else
	            	{
	            		System.out.print("  ");
	            	}
	            }
	            System.out.print(" ");
	            for(j=1;j<=a;j++)
	            {
	                if(j==1||i==3||j==a)
	                {
	                    System.out.print("*"+" ");
	                }
	                else
	                {
	                    System.out.print("  ");
	                }
	                
	            }
	            System.out.print(" ");
	            for(j=1;j<=a;j++)
	            {
	            	if(i+j==a+1||i==j&i!=4&i!=5)
	            	{
	            		System.out.print("*"+" ");
	            	}
	            	else
	            	{
	            		System.out.print("  ");
	            	}
	            }
	           // System.out.print("  ");
	            for(j=1;j<=a*2-1;j++)
	            {
	                if((i+j==6||j-i==4)||(i==3&&j>=3&&j<=7&&j!=4&&j!=6))
	                {
	                    System.out.print("*");
	                 }
	                else
	                {
	                    System.out.print(" ");
	                }

	            }
	            
	            System.out.println();
	            
	       }
	        		
	        		
	        	
	        


	        
	      
	    }
	    
	     
}


