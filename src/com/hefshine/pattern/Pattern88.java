/*
ABBBA
BABAB
BBABB
BABAB
ABBBA
*/
package com.hefshine.pattern;
public class Pattern88 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if(i==j || i+j==4)
					System.out.print("A");
				else
					System.out.print("B");
			}
			System.out.println();
		}

	}

}
