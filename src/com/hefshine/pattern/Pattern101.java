/*
    *****
   *   * 
  *   *  
 *   *   
*****   
*/
package com.hefshine.pattern;
public class Pattern101 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i <=4; i++) 
		{
			for (int j = 0; j <=8; j++) 
			{
				if(i+j==4||i+j==8||(i==0&&j>=4)|| (i==4&&j<=4))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
