/*
	*    
   ***   
  *****  
 ******* 
*********
 ******* 
  *****  
   ***   
    *  
 */
package com.hefshine.pattern;

public class Pattern19 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j < 9; j++) 
			{
				if(i+j>=4 && j-i<=4 && j-i>=-4 && i+j<=12)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
/*
		j										
		0	1	2	3	4	5	6	7	8	9	
i	0					*						
	1				*	*	*					i+j >=4
	2			*	*	*	*	*			 	j-I <=4
	3		*	*	*	*	*	*	*			
	4	*	*	*	*	*	*	*	*	*		
	5		*	*	*	*	*	*	*			j-i>=-4
	6			*	*	*	*	*				i+j <=12
	7				*	*	*					
	8					*						
	9											

*/