/*
12345
 2345
  345
   45
    5
    5
   45
  345
 2345
12345
*/
package com.hefshine.pattern;

public class Pattern41 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <11; i++) 
		{
			for (int j = 1; j <6; j++) 
			{
				if(i<=5)
				{
					if(j-i>=0)
					{
						System.out.print(j);
					}
					else
					{
						System.out.print(" ");
					}
				}
				
				if(i>5)
				{
					if(i+j>=11)
					{
						System.out.print(j);
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
