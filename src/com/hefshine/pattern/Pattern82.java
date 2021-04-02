/*
1        1
22      22
333    333
4444  4444
5555555555
*/
package com.hefshine.pattern;

public class Pattern82 
{

	public static void main(String[] args) 
	{
		for (int i = 1; i < 6; i++) 
		{
			for (int j = 1; j < 11; j++)
			{
				if(j-i<=0 || i+j>=11)
				{
					System.out.print(i);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
