/*
9        
98       
987      
9876     
98765    
987654   
9876543  
98765432 
987654321
*/
package com.hefshine.pattern;

public class Pattern47 
{
	public static void main(String[] args) 
	{
		int n=9;
		for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j < 9; j++) 
			{
				if(j-i<=0)
					System.out.print(n--);
				else
					System.out.print(" ");
			}
			System.out.println();
			 n=9;
		}
	}
}
