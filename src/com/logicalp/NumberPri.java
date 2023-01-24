package com.logicalp;

public class NumberPri {
	
	public static void numberpattern()
	{
		int i,j;
		
		for(i=5;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		NumberPri.numberpattern();
	}

}
