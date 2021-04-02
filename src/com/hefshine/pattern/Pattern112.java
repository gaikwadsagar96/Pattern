/*
 ** ** 
*  *  *
 *   * 
  * *  
   * 
*/
package com.hefshine.pattern;

public class Pattern112 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 7; j++)
			{
				if((j-i ==-1 && i!=0)||(i+j==7 && i!=0)||(j!=0 && j!=3&& j<6 && i==0)||(i==1&&j==3))
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
0		*	*		*	*			j-I ==-1 && i!=0
1	*			*			*		i+j==7 && i!=0
2		*				*			j!=0&&j!=3&&j<6&&i==0
3			*		*				i==1&&j==3
4				*					
5									
6									
7									
*/
