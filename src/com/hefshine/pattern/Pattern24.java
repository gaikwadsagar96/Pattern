/*
    *****
   *****
  *****
 *****
*****
 *****
  *****
   *****
    *****
*/
package com.hefshine.pattern;

public class Pattern24 
{

	public static void main(String[] args) 
	{
		for (int i = 1; i < 6; i++) 
		{
			for (int j = i; j <5 ; j++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j < 6; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 5; i >1 ; i--) 
		{
			for (int j = i-1; j <5 ; j++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j < 6; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
