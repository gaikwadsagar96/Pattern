/*
*     *
 *   * 
  * *  
   *   
  * *  
 *   * 
*     *
	*/
package com.hefshine.pattern;

public class Pattern137 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 7; i++) 
		{
			for (int j = 0; j <7; j++) 
			{
				if((i+j==6)||(i==j))
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
0	*						*		i+j==6	
1		*				*				
2			*		*					
3				*						
4			*		*					
5		*				*				
6	*						*		i==j	
7										
8										
*/
