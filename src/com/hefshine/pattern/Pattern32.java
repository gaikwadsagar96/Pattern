/*
FEDCBA
FEDCB 
FEDC  
FED   
FE    
F
*/
package com.hefshine.pattern;

public class Pattern32 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 6; i++) 
		{
			char c='F';
			for (int j = 0; j <= 5; j++) 
			{
				if(i+j<=5)
					System.out.print(c--);
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
