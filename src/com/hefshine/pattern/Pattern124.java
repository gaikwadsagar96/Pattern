/*
*   *
*  * 
* *  
**   
* *  
*  * 
*   *
 */
package com.hefshine.pattern;

public class Pattern124 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 7; i++) 
		{
			for (int j = 0; j <5; j++) 
			{
				if((i+j==4 ||j-i ==-2 &&j>1)||(j==0 && i<=6))
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
0	*				*	i+j ==5&&j>0	
1	*			*			
2	*		*				
3	*	*					
4	*		*				
5	*			*			
6	*				*	j-I ==-2	
7							
8	j==0&&i>6						
*/