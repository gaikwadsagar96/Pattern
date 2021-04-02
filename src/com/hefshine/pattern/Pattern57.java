/*
1     
2 3    
4 5 6   
7 8 9 10  
11 12 13 14 15 
*/
package com.hefshine.pattern;

public class Pattern57 
{

	public static void main(String[] args) 
	{
		int z=1;
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if(j-i<=0)
				{
					System.out.print(z++ +" ");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
/*
0	1	2	3	4	5	6	7	8	
0	1									j-I <=0
1	2	3								
2	4	5	6							
3	7	8	9	10						
4	11	12	13	14	15					
5										
*/