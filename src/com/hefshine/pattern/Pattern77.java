package com.hefshine.pattern;

public class Pattern77 {

	public static void main(String[] args) 
	{
		for (int i = 1; i < 6; i++)
		{
			int a=0,b=4;
			for (int j = 0; j < i; j++) 
			{
				System.out.print((i+a) +" ");
				a=a+b;
				b--;
			}
			System.out.println();
		}
	/*	int n=5;
		for (int i = 1; i < n; i++)
		{
			int v=i;
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(v +" ");
				v+=n-j;
			}
			System.out.println();
		}*/
	}

}
