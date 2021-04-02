/*
 **** 
*    *
*    *
*    *
*    *
*    *
 **** 
 */
package com.hefshine.pattern;

public class Pattern128 
{

	public static void main(String[] args)
	{
		for (int i = 0; i < 7; i++) 
		{
			for (int j = 0; j <6; j++) 
			{
				if(((j==0 || j== 5) && (i<6 && i>0))||((i==0 || i==6) && (j>0 && j<5)))//
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
/*
0	1	2	3	4	5	6	7	8	9
0		*	*	*	*			i==0&& j>0&&j<5		
1	*					*				
2	*					*				
3	*					*				
4	*					*				
5	*					*				
6		*	*	*	*			i==6&&j>0&&j<5		
7										
8	j==0&&i<6&&i>0					j==5&&i<6&&i>0				
9										
*/