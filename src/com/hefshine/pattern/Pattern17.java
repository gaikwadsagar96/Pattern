/*

* * * * * 
 * * * * 
  * * * 
   * * 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 

 */
package com.hefshine.pattern;

public class Pattern17 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if(j-i>=0 || i+j>=8)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
/*
		j							
		0	1	2	3	4	5	6	7
i	0	*	*	*	*	*			
	1		*	*	*	*		j-I >=0	
	2			*	*	*			
	3				*	*			
	4					*			
	5				*	*		i+j> =8	
	6			*	*	*			
	7		*	*	*	*			
	8	*	*	*	*	*			
	9								


*/
