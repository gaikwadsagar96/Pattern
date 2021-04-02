package com.hefshine.pattern;

public class Pattern33 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 6; i++) 
		{
			char c='F';
			for (int j = 0; j <6 ; j++) 
			{
				if(j-i<=0)
					System.out.print(c--);
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
