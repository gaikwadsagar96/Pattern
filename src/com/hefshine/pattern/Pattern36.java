/*
A     
BA    
CBA   
DCBA  
EDCBA 
FEDCBA
*/
package com.hefshine.pattern;

public class Pattern36 
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
					System.out.print(c--);
				} else 
				{
					System.out.print(" ");
				}
			}
			c+=2+(char) + i;
			System.out.println();
		}

	}

}
