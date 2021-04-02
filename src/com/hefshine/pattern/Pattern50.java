/*
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
*/
package com.hefshine.pattern;

public class Pattern50 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i <=6; i++)
		{
			
			for (int j = 0; j <=9; j++) 
			{
				for (int k = 1; k <=3 ; k++) 
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}

	}

}
