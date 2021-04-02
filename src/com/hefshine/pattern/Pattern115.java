/*
**** 
*   *
*   *
**** 
*   *
*   *
**** 
*/
package com.hefshine.pattern;

public class Pattern115 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 7; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if(((i==0||i==3||i==6)&&j<4)||(j==0&&i<7)||((j==4)&& (i==1||i==2||i==4||i==5)))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
/*
0	1	2	3	4	5	6
0	*	*	*	*			i==0&&j<4
1	*				*		
2	*				*		
3	*	*	*	*			i==3&&j<4
4	*				*		
5	*				*		
6	*	*	*	*			i==6&&j<4
7	j==0&&i<7				j==4&& i==1||i==2||i==4||i==5		
*/