/*
*********
 ******* 
  *****  
   ***   
    *    
   ***   
  *****  
 ******* 
*********

 */
package com.hefshine.pattern;

public class Pattern16 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j < 9; j++) 
			{
				if((j-i>=0 && i+j<=8) ||(i+j>=8 && j-i<=0) )
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
i	0	*	*	*	*	*	*	*	*	*		j-I >=0
	1		*	*	*	*	*	*	*			i+j =8
	2			*	*	*	*	*				
	3				*	*	*					
	4					*						i+j >=8
	5				*	*	*					j-I <=0
	6			*	*	*	*	*				
	7		*	*	*	*	*	*	*			
	8	*	*	*	*	*	*	*	*	*		


*/