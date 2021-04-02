/*
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
 4 4 4 4 
  5 5 5 
   6 6 
    7
    */
package com.hefshine.pattern;

public class Pattern51 
{

	public static void main(String[] args) 
	{
		int z=2;
		for (int i = 1; i <=9; i++) 
		{
			for (int j = 1; j <=5; j++) 
			{
				if (j-i>=-4 && i+j>=6)//
				{
					if(i<=5)
						System.out.print(i+" ");
					else
						System.out.print(Math.abs(z-i)+ " ");
				} else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
