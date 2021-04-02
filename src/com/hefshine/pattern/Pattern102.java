/*
*****    
 *   *   
  *   *  
   *   * 
    *****  
 */
package com.hefshine.pattern;

public class Pattern102 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i <=4; i++) {
			for (int j = 0; j <=8; j++) {
				if (j-i==0 || j-i==4||(i==4&&j>=4)||(i==0&&j<=4)) 
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
