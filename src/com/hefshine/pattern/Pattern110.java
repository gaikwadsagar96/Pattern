package com.hefshine.pattern;
/*
55555
45555
34555
23455
12345

 */
public class Pattern110 {

	public static void main(String[] args) {
		for (int i = 5; i >=1; i--)
		{
			for (int j = i; j <=5; j++)
			{
				System.out.print(j);
			}
			for (int j = 1; j <i; j++)
			{
				System.out.print(5);
			}
			System.out.println();
		}
	}

}
