/*
*           *
 *         * 
  *       *  
   *     *   
    *   *    
     * *     
      *     
 */
package com.hefshine.pattern;

public class Pattern135 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 7; i++) 
		{
			for (int j = 0; j <13; j++) 
			{
				if((i==j &&j<=6)||(i+j==12))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
/*
0	1	2	3	4	5	6	7	8	9	10	11	12	13
0	*												*	i+j==12
1		*										*		
2			*								*			
3				*						*				
4					*				*					
5						*		*						
6							*							i==j &&j<=6
7														
*/
