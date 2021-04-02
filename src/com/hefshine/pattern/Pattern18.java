/*
        * 
       * * 
      * * * 
     * * * * 
    * * * * * 
     * * * * 
      * * * 
       * * 
        * 

 */
package com.hefshine.pattern;

public class Pattern18 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 10; i++) 
		{
			for (int j = 0; j < 9; j++) 
			{
				if(i+j>=9 && j-i>=-1)
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
		0	1	2	3	4	5	6	7	8	9	10
i	0										*	
	1									*	*	i+j >=9
	2								*	*	*	
	3							*	*	*	*	
	4						*	*	*	*	*	j-I >=-1
	5							*	*	*	*	
	6								*	*	*	
	7									*	*	
	8										*	
	9											


*/