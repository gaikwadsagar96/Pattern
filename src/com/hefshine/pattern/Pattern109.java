/*
11111
11122
11333
14444
55555
*/
package com.hefshine.pattern;

public class Pattern109 
{

	public static void main(String[] args) 
	{
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if(i+j>=5)
					System.out.print(i);
				else
					System.out.print("1");
			}
			System.out.println();
		}

	}

}
