/*

*
***
*****
*******
*********

*/
package com.hefshine.pattern;

public class Pattern70 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 10; i=i+2) 
		{
			for (int j = 0; j < 10; j++) 
			{
				if(j-i<=0)
					System.out.print("*");
				else
					System.out.print("");
			}
			System.out.println();
		}

	}

}
