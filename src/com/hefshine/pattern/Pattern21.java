/*
    *****
   ***** 
  *****  
 *****   
***** 
 */

package com.hefshine.pattern;

public class Pattern21 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j <9; j++) 
			{
				if (i+j>=4 && i+j<=8) 
				{
					System.out.print("*");
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
		0	1	2	3	4	5	6	7	8	9	10
i	0					*	*	*	*	*		
	1				*	*	*	*	*			i+j >=4
	2			*	*	*	*	*				i+j <=8
	3		*	*	*	*	*					
	4	*	*	*	*	*						
	5											

*/