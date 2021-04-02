/*
1        1
12      21
123    321
1234  4321
1234554321
*/
package com.hefshine.pattern;

public class Pattern81 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i < 6; i++)
		{
			int n=5;
			for (int j = 1; j < 11; j++)
			{
				if(j<=5)
				{
					if(j-i<=0)
					{
						System.out.print(j);
					}else
						System.out.print(" ");
				}
				if(j>=6)
				{	
					if(i+j>=11) {
						System.out.print(n);
						n--;
					}
					else
					{
						System.out.print(" ");
						n--;
					}	
				}
			}
			System.out.println();
		}
	}
}
