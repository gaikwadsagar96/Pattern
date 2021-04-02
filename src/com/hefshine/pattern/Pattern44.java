/*
    1
   22
  333
 4444
55555
*/
package com.hefshine.pattern;

public class Pattern44 
{

	public static void main(String[] args) 
	{
		for (int i = 1; i <6; i++) 
		{
			for (int j = 1; j <6; j++) 
			{
				if(i+j>=6)
					System.out.print(i);
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
