/*
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5 
*/
package com.hefshine.pattern;

public class Pattern43 
{

	public static void main(String[] args) 
	{
		//int n=5;
		for (int i = 0; i < 5; i++) 
		{
			
			for (int j = 1; j < 6; j++) 
			{
				if(i+j>=5)
				{
					System.out.print(j+" ");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
