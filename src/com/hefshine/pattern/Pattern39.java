/*
5    
54   
543  
5432 
54321
*/
package com.hefshine.pattern;

public class Pattern39 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i <5; i++) 
		{
			int no=5;
			for (int j = 0; j < 5; j++) 
			{
				if(j-i<=0)
					System.out.print(no--);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
