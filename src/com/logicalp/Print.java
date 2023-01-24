package com.logicalp;

public class Print {

	public static void star()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void sta()
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{ 
		Print.star();
		Print.sta();
	}
}
