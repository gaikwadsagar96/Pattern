/*
1        1
12      12
123    123
1234  1234
1234512345
*/
package com.hefshine.pattern;
public class Pattern83 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 5; i++) 
		{
			//int z=5;
			int z=1;
			for (int j = 1; j < 11; j++) 
			{
				if(j<=5)
				{
				if(j-i<=1)
					System.out.print(j);
				else
					System.out.print(" ");
				}
				if(j>=6)
				{
					if(i+j>=10)
					{
						System.out.print(z++);
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
