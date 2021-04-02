package com.hefshine.pattern;

public class Pattern26 {

	public static void main(String[] args) {
		char c='A';
		for (int i = 0; i < 5; i++) 
		{	
			for (int j = 0; j < 5; j++) 
			{
				if (j-i<=0) 
				{
					System.out.print(c);
					//c++;
				} else 
				{	
					System.out.print(" ");
				}
			}
			System.out.println();
			c++;
		}
	}

}
