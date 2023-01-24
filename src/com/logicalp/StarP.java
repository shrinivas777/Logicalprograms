package com.logicalp;
import java.util.Scanner;
public class StarP {
	
	 static int n,i,j,b;
	 static Scanner t = new Scanner(System.in);
	 
	public void test()
	{
		
		System.out.print("Enter number of rows(n)=");
		n=t.nextInt();
	
		
		for(i=1;i<=n;i++)
		{
			for(b=1;b<=n-i;b++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=(2*i-1);j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	    	System.out.println();
	}
	
	public static void type()
	{
		System.out.print("Enter any number of rows=");
		n=t.nextInt();
		t.close();
		for(i=1;i<=n;i++)
		{
			for(b=5;b>i;b--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[]a)
	{
		StarP y = new StarP ();
		y.test();
		StarP.type();
	}

}
