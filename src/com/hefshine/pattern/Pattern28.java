/*
A    
AB   
ABC  
ABCD 
ABCDE
ABCD 
ABC  
AB   
A 
 */
package com.hefshine.pattern;

public class Pattern28 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 9; i++) 
		{
			for (int j = 1; j < 6; j++) 
			{
				if (j-i<=1 && i+j<=9) 
				{			
					System.out.print((char)(64+j));
				} else 
				{	
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
		/*for (int i = 0; i < 9; i++) 
		{
			char c='A';
			for (int j = 0; j < 5; j++) 
			{
				if (j-i<=0 && i+j<=8) 
				{			
					System.out.print(c);
					c++;
				} else 
				{	
					System.out.print(" ");
				}	
			}
			System.out.println();
		}*/
	}

}
