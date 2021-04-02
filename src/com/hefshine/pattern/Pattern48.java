/*
9        
88       
777      
6666     
55555    
444444   
3333333  
22222222 
111111111
*/
package com.hefshine.pattern;

public class Pattern48 
{
	public static void main(String[] args) 
	{
		/*int n=9;
		for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j < 9; j++) 
			{
				if(j-i<=0)
					System.out.print(n);
				else
					System.out.print(" ");
			}
			System.out.println();
			 n--;
		}*/
		//---------------------------------option2
		for (int i = 9; i >0; i--) 
		{
			for (int j = i; j <= 9; j++) 
			{
				
					System.out.print(i);
			}
			System.out.println();
			
		}
	}
}
