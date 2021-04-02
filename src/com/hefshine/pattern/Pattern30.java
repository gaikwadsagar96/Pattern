/*
FEDCBA
EDCBA
DCBA
CBA
BA
A
BA
CBA
DCBA
EDCBA
FEDCBA

*/
package com.hefshine.pattern;

public class Pattern30 
{
	public static void main(String[] args) 
	{	
		/*for (int i = 6; i>=1; i--) 
		{
			for (int j = i; j >=1; j--) 
			{
				System.out.print((char)(64+j));
			}
			System.out.println();
		}
		for (int i = 2; i<=6; i++) 
		{
			for (int j = i; j >=1; j--) 
			{
				System.out.print((char)(64+j));
			}
			System.out.println();
		}
*/
		for (int i = 0; i < 11; i++) 
		{
			int b=i-4;
			for (int j = 0; j <6; j++) 
			{
				int a=6;
				if (i+j<=5) 
				{
					System.out.print(a-j-i);
				}
				
				if (j-i<=-5 &&i>5) 
				{
					System.out.print(b--);
				}
			}
			System.out.println();
			
		}
	
	}
}
