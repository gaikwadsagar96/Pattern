/*

10000
02000
00300
00040
00005

*/package com.hefshine.pattern;

public class Pattern108 
{

	public static void main(String[] args) 
	{
		int cnt=1;
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if(i==j)
					System.out.print(cnt++);
				else
					System.out.print("0");
			}
			System.out.println();
		}

	}

}
