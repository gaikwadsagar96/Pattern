/*
*  *  *
* * * *
**   **
*     *
	*/
package com.hefshine.pattern;

public class Pattern136 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j <7; j++) 
			{
				if((j==0 || j==6)||(i+j==3&&j<=3)||(j-i==3&&j>=3))
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
0	*			*			*	
1	*		*		*		*	
2	*	*				*	*	
3	*						*	
4	j==0&&i>4						j==6&& i>4	
5			i+j==3&&j<=3					
6				j-i==3&&j>=3				
*/