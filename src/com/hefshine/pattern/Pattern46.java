/*
1        
22       
333      
4444     
55555    
666666   
7777777  
88888888 
999999999
*/
package com.hefshine.pattern;
public class Pattern46 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i < 10; i++)
		{
			for (int j = 0; j < 9; j++) 
			{
				if(j-i<=-1)
					System.out.print(i);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
