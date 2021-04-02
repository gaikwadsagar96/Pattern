/*
*********
 *     * 
  *   *  
   * *   
    *    
*/
package com.hefshine.pattern;

public class Pattern97 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 9; j++) 
			{
				if(i==0||i+j==8||j-i==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
