/*
* *
** **
*** ***
**** ****
***** *****
*/
package com.hefshine.pattern;

public class Pattern75 
{

	public static void main(String[] args) 
	{
/*		for (int i = 1; i <=5; i++) {
			for (int j = i; j >=1; j--) {
				System.out.print("*");
			}
			for (int j = 0; j < 1; j++)
			{
				System.out.print(" ");
			}
			for (int j = i; j >=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		for (int i = 1; i <=5; i++) 
		{
		
			for (int j = 1; j <=2*i+1; j++) 
			{
				if(j-i==1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}	

	}

}