/*
N       N
 N     N 
  N   N  
   N N   
    N    
*/
package com.hefshine.pattern;

public class Pattern93 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 9; j++) 
			{
				if(i==j || i+j==8)
					System.out.print("N");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
