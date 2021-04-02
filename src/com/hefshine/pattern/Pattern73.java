/*
A
BAB
CBABC
DCBABCD
EDCBABCDE
 */
package com.hefshine.pattern;

public class Pattern73 
{

	public static void main(String[] args) 
	{
		for (int i = 1; i < 6; i++) 
		{
			for (int j = i; j >=1; j--) 
			{
				System.out.print((char)(64+j));
			}
			for (int j = 2; j <=i; j++) 
			{
				System.out.print((char)(64+j));
			}
			
			System.out.println();
		}
		/*for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j <= i; j++) 
			{
				if(j-i<=0)
				{
					if(j<9/2) 
						System.out.print((char)(j+65));
					else if(j>9/2) {
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				
			}
			for (int j = i; j <= i*2; j++) 
			{
				if(j-i<=0)
					System.out.print("*"); 
				else
					System.out.print(" ");
			}
			System.out.println();
		}*/
		/*for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 11; j++) 
			{
				if(j-i<=0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for (int j = i; j < i*2; j++) 
			{
				if(j-i>=0)
					System.out.print("*");
			}
			System.out.println();
		}*/

	}

}