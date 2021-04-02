/*
1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5 
*/
package com.hefshine.pattern;

public class Pattern60 {

	public static void main(String[] args) 
	{
		
		for (int i = 1; i<=5; i++) 
		{
			for (int j = i; j >1 ; j--)
			{
				System.out.print(" ");
			}
			for (int j = i; j <=5; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for (int i = 4; i>=1; i--) 
		{
			for (int j = 1+1; j <=i ; j++)
			{
				System.out.print(" ");
			}
			for (int j = i; j <=5; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	/*	int z=0;
		for (int i = 1; i <9; i++) 
		{
			//z=z+i;
			for (int j = 1; j <9; j++) 
			{
			//	if(i<=5)
				//{
					if(i+j<=8 && j-i<=0)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				//}	
				//if(i>5)
				//{
					if(j-i<=0)
					{
						System.out.print("");
					}
					else
					{
						System.out.print(" ");
					}
				//}
			}
			System.out.println();
		}*/

	

}