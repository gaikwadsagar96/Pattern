/*
OXXXX
XOXXX
XXOXX
XXXOX
XXXXO
*/
package com.hefshine.pattern;

public class Pattern86 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 5; j++)
			{
				if(i!=j)
					System.out.print("X");	
				else
					System.out.print("O");
			}
			System.out.println();
		}

	}

}
