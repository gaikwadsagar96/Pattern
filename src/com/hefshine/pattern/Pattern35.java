/*
A     
BC    
DEF   
GHIJ  
KLMNO 
PQRSTU
*/
package com.hefshine.pattern;

public class Pattern35 
{

	public static void main(String[] args) 
	{
		char c='A';
		for (int i = 0; i < 6; i++)
		{
			for (int j = 0; j < 6; j++) 
			{
				if (j-i<=0) 
				{
					System.out.print(c++);
				} else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
