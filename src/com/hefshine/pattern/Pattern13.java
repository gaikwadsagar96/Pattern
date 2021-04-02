/*
 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
 
 */
package com.hefshine.pattern;

public class Pattern13 
{

	public static void main(String[] args)
	{
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j <5 ; j++) 
			{
				if(j-i>=0)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
/*
0	1	2	3	4	5
1	*	*	*	*	*
2		*	*	*	*
3			*	*	*
4				*	*
5					*
6					j-i >= 0


*/