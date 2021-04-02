/*
A     
AB    
ABC   
ABCD  
ABCDE 
ABCDEF
*/
package com.hefshine.pattern;

public class Pattern31 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 6; i++) 
		{
			char c='A';
			for (int j = 0; j <= 5; j++) 
			{
				if(j-i<=0)
					System.out.print(c++);
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
