package com.hefshine.pattern;
/*
 1
121
12321
1234321
123454321
 */
public class Pattern71 {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++)
		{
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(j);
			}
			//System.out.print(" ");
			for (int j = i-1; j >=1; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
