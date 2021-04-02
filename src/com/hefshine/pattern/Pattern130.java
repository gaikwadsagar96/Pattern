/*
 *** 
*   *
*   *
*   *
*   *
**  *
 *** 
    *
*/
package com.hefshine.pattern;

public class Pattern130 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 8; i++) 
		{
			for (int j = 0; j <5; j++) 
			{
				if((j==0&&i<6&&i>0)||(j==4&&i<=7&&i>0&&i!=6)||((i==0 || i==6) && (j>0&&j<4))||(i==5&&j<2))//
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
/*
0	1	2	3	4	5	6	7	8	9	10
0		*	*	*				i==0&& j>0&&j<4			
1	*				*						
2	*				*						
3	*				*						
4	*				*						
5	*	*			*		i==5&&j<2				
6		*	*	*			i==6&&j>0&&j<4				
7					*						
8	j==0&&i<=6&&i>0										
9					j==4&&i<=7&&i>0&&i!=6						
10											
*/