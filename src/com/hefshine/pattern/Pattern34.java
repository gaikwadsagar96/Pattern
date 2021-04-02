/*
ABCDEF
ABCDE 
ABCD  
ABC   
AB    
A
*/
package com.hefshine.pattern;

public class Pattern34 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 6; i++) 
		{
			char c='A';
			for (int j = 0; j <6 ; j++) 
			{
				if(i+j<=5)
					System.out.print(c++);
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
