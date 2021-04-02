/*
 ****
*    
*    
*    
*    
*    
 ****
 */
package com.hefshine.pattern;

public class Pattern116 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 7; i++) 
		{
			for (int j = 0; j <5; j++) 
			{
				if(((i==0 || i==6)&&(j>=1))||(j==0&&i<6&&i>0))
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
0		*	*	*	*		i==0&&j<=4&& j>=1		
1	*								
2	*								
3	*								
4	*								
5	*								
6		*	*	*	*		i==6&&j<=4&&j>=1		
7	j==0&&i<6&&i>0								
*/