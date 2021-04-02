/*
1        
12       
123      
1234     
12345    
123456   
1234567  
12345678 
123456789
*/
package com.hefshine.pattern;

public class Pattern45 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 9; i++)
		{
			for (int j = 1; j < 10; j++) 
			{
				int z=j;
				if(j-i<=1)
					System.out.print(z++);
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
