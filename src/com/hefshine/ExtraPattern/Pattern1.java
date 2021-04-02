/*
    *    
    *    
   ***   
   ***   
  *****  
  *****  
 ******* 
 ******* 
*********
*/
package com.hefshine.ExtraPattern;

public class Pattern1 {

	public static void main(String[] args) 
	{
		/*int k=2,n=5;
		for (int i = 0; i < n; i++) 
		{
			int cnt=0;
			if(i<n-1)
			{
				while(cnt<k)
				{
					for (int j = 0; j < 9; j++) 
					{
						if(j>=4-i && j<=4+i)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					System.out.println();
					cnt++;
				}
			}
			else
			{
				for (int j = 0; j < 9; j++) 
				{
					if(j>=4-i && j<=4+i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
			
		}*/
		
		//=======================
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j <17; j=j+2)
			{
				if(i+j>7 && j-i<9)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
