/*
 *** 
*   *
*   *
*****
*   *
*   *
*   *

*/
package com.hefshine.pattern;

public class Pattern114 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 7; i++)
		{
			for (int j = 0; j < 5; j++) 
			{
				if(((j==0 || j==4) && i>0)||(i==0&&j>0&&j<4)|| (i==3 && j>=0))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}
/*
0	1	2	3	4	5	6	7	8
0		*	*	*			i==0&&j>0&&j<4		
1	*				*				
2	*				*				
3	*	*	*	*	*		i==3 && j>=0		
4	*				*				
5	*				*				
6	*				*				
7	(i>0&& j==0) 				j==4 && i>0				
8									
*/
