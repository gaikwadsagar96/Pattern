/*
12345
2345 
345  
45   
5 
*/
package com.hefshine.pattern;

public class Pattern40 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <6; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if(i+j<=5)
					System.out.print(i+j);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
