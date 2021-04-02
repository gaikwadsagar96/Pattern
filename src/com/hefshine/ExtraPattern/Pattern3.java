/*
13579
35791
57913
79135
91357*/

package com.hefshine.ExtraPattern;

public class Pattern3 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i <=8; i+=2) 
		{
			int a=1;
			for (int j = 0; j <=8; j+=2) 
			{
				if(i+j<=8)
					System.out.print(a+i+j);
				else if(i+j>8)
				{
					System.out.print(a);
					a+=2;
				}
			}
			System.out.println();
		}

	}

}
