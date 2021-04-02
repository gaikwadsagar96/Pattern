/*
*        *
**      **
***    ***
****  ****
**********
*/
package com.hefshine.pattern;

public class Pattern80 {

	public static void main(String[] args) 
	{
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j <10; j++) 
			{
				if((j-i<=0)||(i+j>=9))
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
0	*									*	
1	*	*							*	*	
2	*	*	*					*	*	*	
3	*	*	*	*			*	*	*	*	
4	*	*	*	*	*	*	*	*	*	*	
5											
6	j-I <=0						i+j> =9				
*/
