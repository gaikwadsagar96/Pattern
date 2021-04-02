package com.hefshine.ExtraPattern;

public class RombusStucture 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i < 6; i++) 
		{
			int row=i;//print start with row
			for (int j = 1; j < 10; j++) 
			{
				if(i+j>=6 && j<=5)
				{
					System.out.print(row--);
				}
				else
					System.out.print(" ");
				int col=j; //print start with col
				if(j-i<=4 && j>5)
				{
					System.out.print(col-4);
				}
				else if(j!=5)// for print only one time space
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
