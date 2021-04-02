/*
1
11
121
1331
14641
*/
package com.hefshine.ExtraPattern;

public class PascleTr 
{

	public static void main(String[] args) 
	{
		for (int i = 1; i < 6; i++) 
		{
			int num=1;
			for (int j = 1; j <6 ; j++) 
			{
				if(j-i<=0)
				System.out.print(num);
				num=num*(i-j)/j;
			}
			System.out.println();
		}
	}

}
