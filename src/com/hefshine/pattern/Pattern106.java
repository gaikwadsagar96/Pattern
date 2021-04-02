/*
1
01
101
0101
*/
package com.hefshine.pattern;

public class Pattern106 {

	public static void main(String[] args) 
	{
		for (int i = 1; i <=5; i++) {
			for (int j = i; j >=1 ; j--) {
				System.out.print(j%2);
			}
			System.out.println();
		}
		//int n=1;
	/*	for (int i = 1; i < 5; i++) 
		{
			for (int j = 0; j <i; j++) 
			{
				System.out.print((j+i)%2);
				//if(n%2==0)
					//System.out.print(0);
			//	else
				//	System.out.print(1);
			//	n++;
			}
			System.out.println();
		}		*/


	}

}
