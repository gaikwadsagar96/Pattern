package com.hefshine.pattern;

public class Pattern37 {

	public static void main(String[] args) 
	{
		
		for (int i = 1; i <=6; i++)
		{
			int q = i;
			for (int j = 1; j <=i; j++) 
			{
				System.out.print((char)(64+q));
				q=q+5;
			}
			System.out.println();
		}
		System.out.println("\n---------------------------\n");
		for (int i = 1; i <=6; i++)
		{
			int q = i;
			for (int j = 1; j <=i; j++) 
			{
				System.out.print((q+"\t"));
				q=q+5-j;
				q++;
			}
			System.out.println("\n");
		}
	}
}
