/*
A    
AB   
ABC  
ABCD 
ABCDE

 */
package com.hefshine.pattern;

public class Pattern25 
{

	public static void main(String[] args) 
	{
		for (int i = 1; i <=5; i++) 
		{
			//char c='A';
			for (int j = 1; j <= 5; j++) 
			{
				if (j-i<=0) 
				{
					System.out.print((char)(64+j));
					//c++;
				} else 
				{	
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
/*
		j							
		0	1	2	3	4	5	6	7
i	0	A							
	1	A	B						
	2	A	B	c				j-i<=0	
	3	A	B	c	d				
	4	A	B	c	d	e			
	5								

*/