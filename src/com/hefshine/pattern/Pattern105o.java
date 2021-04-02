package com.hefshine.pattern;

public class Pattern105o 
{

	public static void main(String[] args) 
	{
	/*	for (int i = 0; i < 5; i++) 
		{
			int n=1;
			for (int j = 0; j < 5; j++) 
			{
				if(j-i<=0)
				{
				if(n%2==0)
					System.out.print(0);
				else
					System.out.print(1);
				n++;
				}
			}
			System.out.println();
		}*/
		
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 1; j <=i; j++)
			{
				System.out.print(j%2);
			}
			System.out.println();
		}
	}
}
