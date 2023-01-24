package com.logicalp;

public class LogicalP {
	static int i,j;
	public void test()
	{
		
		for(i=1;i<=4;i++) 
		{
		  for(j=1;j<=i;j++)
		    {
				System.out.print(i+" ");
			}
			    System.out.println();
		}
		
		        System.out.println();
	}
	          
	public static void type()
	{
		for(i=5;i>=1;i--)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(i+" ");
			}
			    System.out.println();
		}
	}
	
	public static void main(String[]a)
	{
		        LogicalP t = new LogicalP();
		        t.test();
		        LogicalP.type();
	}

}
