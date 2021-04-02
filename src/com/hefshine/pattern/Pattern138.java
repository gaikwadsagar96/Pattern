/*
*     *
 *   * 
  * *  
   *   
   *   
   *   
   *  
 */
package com.hefshine.pattern;

public class Pattern138 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 7; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				if((i+j==6&&j>=3)|| (i==j&&j<=3)||(j==3&&i>=3))
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
0	*						*		i+j==6&&j>=3
1		*				*			i==j&&j<=3
2			*		*				
3				*					j==3&&i>=3
4				*					
5				*					
6				*					
*/