/*
*****
  *  
  *  
  *  
  *  
  *  
*****
*/
package com.hefshine.pattern;

public class Pattern122 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 7; i++) 
		{
			for (int j = 0; j <5; j++) 
			{
				if(((i==0||i==6) && (j<5))||(j==2&&i<7))
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
0	*	*	*	*	*		i==0&&j<5
1			*				
2			*				
3			*				
4			*				
5			*				i==6&&j<5
6	*	*	*	*	*		
7			j==2&&i<7				
*/