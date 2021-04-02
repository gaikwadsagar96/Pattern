/*
*   *
*   *
*   *
*   *
*   *
*   *
 *** 
*/
package com.hefshine.pattern;

public class Pattern134 {

	public static void main(String[] args)
	{
		for (int i = 0; i < 7; i++) 
		{
			for (int j = 0; j <5; j++) 
			{
				if(((j==0 || j==4) && (i<6))||(i==6&&j<4&&j>0))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
/*
0	1	2	3	4	5	6	7
0	*				*			
1	*				*			
2	*				*			
3	*				*			
4	*				*			
5	*				*			
6		*	*	*				i==6&&j<4&&j>0
7								
8	j==0&& i<6				j==4&&i<6			
*/
