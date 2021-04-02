package com.hefshine.pattern;

public class Pattern08 
{

	public static void main(String[] args) 
	{
		//System.out.println((-4<0)?-4:0);
		for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if(i+j>=4 && j-i>=-4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
