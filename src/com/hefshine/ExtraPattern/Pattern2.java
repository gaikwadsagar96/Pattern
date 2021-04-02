/*
10000001
33000033
55500555
77777777
55500555
33000033
10000001
*/
package com.hefshine.ExtraPattern;

public class Pattern2
{
	public static void main(String[] args) 
	{
		int a=1;
		for (int i = 0; i < 7; i++) 
		{
			for (int j = 0; j < 8; j++) 
			{
				if((j-i<=0 && i+j<=6)||(i+j>=7 && j-i>=1))
					System.out.print(a);
				else
					System.out.print("0");
			}
			if(i<3)
				a+=2;
			else
				a-=2;
			System.out.println();
		}
	}

}
