
/*PPPPP
PQQQP
PQQQP
PQQQP
PPPPP
*/
package com.hefshine.pattern;
public class Pattern90 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if(i==0 ||j==0||i==4|| j==4)
					System.out.print("P");
				else
					System.out.print("Q");
			}
			System.out.println();
		}

	}

}
