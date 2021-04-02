/*
10101
10101
10101
10101
10101
*/
package com.hefshine.pattern;

public class Pattern104 {

	public static void main(String[] args) 
	{
		
		for (int i = 0; i < 5; i++) 
		{
			int n=1;
			for (int j = 0; j < 5; j++) 
			{
				if(n%2==0)
					System.out.print(0);
				else
					System.out.print(1);
				n++;
			}
			System.out.println();
		}
	}

}
