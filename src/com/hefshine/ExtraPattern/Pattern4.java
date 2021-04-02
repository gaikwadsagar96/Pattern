package com.hefshine.ExtraPattern;

public class Pattern4 {

	public static void main(String[] args) 
	{
		int num=7;
		for (int i = 1; i <=num; i++)
		{
			int p=i;
			for (int j = 1; j <=i; j++)
			{
				System.out.print(p+"\t");
				p=p+num-j;
			}
			System.out.println("\n");
		}	
		
		System.out.println("\n\n\n");
		
		for (int i = 1; i < 11; i++)
		{
			for (int j = 0; j <10; j++) 
			{
				System.out.print((i*11+j*i)+"\t");
			}
			System.out.println();
		}
System.out.println("\n\n\n");
		
		for (int i = 1; i < 6; i++)
		{
			int no=1;
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(no);
				no=no*(i-j)/j;
			}
			System.out.println();
		}
	}

}
