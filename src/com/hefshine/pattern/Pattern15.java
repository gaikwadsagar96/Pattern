package com.hefshine.pattern;

public class Pattern15 {
//not complete
	public static void main(String[] args) 
	{
		/*for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j < 9; j++) 
			{
				if(j-i>=0 && i+j>=0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}		*/
		
		for (int i = 1; i < 6; i++)
		{
			for (int space = 2; space <=i; space++) 
			{
				System.out.print(" ");
			}
			for (int j = i; j < 6; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 2; i < 6; i++)
		{
			for (int space = 1; space <5; space++) 
			{
				System.out.print(" ");
			}
			for (int j = i; j >=1; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
