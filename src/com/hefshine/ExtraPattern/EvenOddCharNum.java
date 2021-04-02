package com.hefshine.ExtraPattern;

import java.util.Scanner;

public class EvenOddCharNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1;
		if(n%2!=0)
		{
			for (int i = 0; i < n*2; i++) 
			{
				for (int j = 0; j <n; j++) 
				{
					if(i+j>=n-1 && j-i>=1-n )
					{
						System.out.print(a+" ");
						if(a<9)
							a++;
						else
							a=0;
					}
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
		else
		{
			for (int i = 0; i < (n*2)-1; i++) 
			{
				for (int j = 0; j < n; j++) 
				{
					if(i+j>=n-1 && j-i>=1-n)
					{
						System.out.print((char)(64+(int)a)+ " ");
						if(a<=25)
							a++;
						else
							a=1;
					}
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
		

	}

}
